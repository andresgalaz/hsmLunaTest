package to.noc.hsm.lunasa.example;

import static java.lang.System.err;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO;

import org.apache.axis.encoding.Base64;

public class Utilidades {
	public static final String NAME = "Utilidades";

	public Integer calcularNumeroPaginas(Integer filasPorPaginas, Integer totalFilas) {
		Integer total = 1;
		if (totalFilas.compareTo(0) == 0) {
			total = 1;
		} else {
			total = totalFilas / filasPorPaginas;
		}
		if (totalFilas % filasPorPaginas > 0)
			total++;
		return total;
	}

	public Map<String, String> getValues(String parametros) {
		Map<String, String> valoresMap = new HashMap<String, String>();
		String[] datos = parametros.split("\\&");
		for (String dato : datos) {
			String[] valores = dato.split("\\=");
			if (valores.length == 2) {
				String valor = valores[1].replace("+", " ");
				valor = valor.replace("%3A", ":");
				valor = valor.replace("%2F", "/");
				valoresMap.put(valores[0], valor);
			} else
				valoresMap.put(valores[0], "");

		}
		return valoresMap;

	}

	public String getLogin(String parametros, String nombreVariableLogn) {

		String[] datos = parametros.split("\\&");
		String resultado = "";
		for (String dato : datos) {
			String[] valores = dato.split("\\=");
			if (valores.length == 2) {
				if (valores[0].equals(nombreVariableLogn))
					resultado = valores[1];
			}
		}
		return resultado;

	}

	public Integer getStartPaging(Integer numPage, Integer rowsPerPag) {
		return (numPage * rowsPerPag) - rowsPerPag;

	}

	public Integer getEndPaging(Integer numPage, Integer rowsPerPag) {
		return (numPage * rowsPerPag);
	}

	public byte[] base64Decode(String archivoB64) {
		return Base64.decode(archivoB64);
	}

	public String base64Encode(byte[] data) {
		return Base64.encode(data);
	}

	public InputStream base64ToInputStream(String strb64) {
		byte[] certByte = Base64.decode(strb64);
		InputStream is = new ByteArrayInputStream(certByte);
		return is;
	}

	private byte[] encrypt(String value, String keyAes) throws NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		byte[] encrypted = null;
		byte[] raw = keyAes.getBytes();
		Key skeySpec = new SecretKeySpec(raw, "AES");
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		byte[] iv = new byte[cipher.getBlockSize()];
		IvParameterSpec ivParams = new IvParameterSpec(iv);
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivParams);
		encrypted = cipher.doFinal(value.getBytes());
		return encrypted;
	}

	private byte[] encrypt(byte[] value, String keyAes) throws NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		byte[] encrypted = null;
		byte[] raw = keyAes.getBytes();
		Key skeySpec = new SecretKeySpec(raw, "AES");
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		byte[] iv = new byte[cipher.getBlockSize()];
		IvParameterSpec ivParams = new IvParameterSpec(iv);
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivParams);
		encrypted = cipher.doFinal(value);
		return encrypted;
	}

	private byte[] decrypt(byte[] encrypted, String keyAes) throws NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		byte[] original = null;
		Cipher cipher = null;
		byte[] raw = keyAes.getBytes();
		Key key = new SecretKeySpec(raw, "AES");
		cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		// the block size (in bytes), or 0 if the underlying algorithm is not a block
		// cipher
		byte[] ivByte = new byte[cipher.getBlockSize()];
		// This class specifies an initialization vector (IV). Examples which use
		// IVs are ciphers in feedback mode, e.g., DES in CBC mode and RSA ciphers with
		// OAEP encoding operation.
		IvParameterSpec ivParamsSpec = new IvParameterSpec(ivByte);
		cipher.init(Cipher.DECRYPT_MODE, key, ivParamsSpec);
		original = cipher.doFinal(encrypted);

		return original;
	}

	public String toSHA1(byte[] data) {
		final char[] HEX_CHARS = "0123456789ABCDEF".toCharArray();
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA-1");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		byte[] buf = md.digest(data);
		char[] chars = new char[2 * buf.length];
		for (int i = 0; i < buf.length; ++i) {
			chars[2 * i] = HEX_CHARS[(buf[i] & 0xF0) >>> 4];
			chars[2 * i + 1] = HEX_CHARS[buf[i] & 0x0F];
		}
		return new String(chars);
	}

	public String bytesToHex(byte[] bytes) {
		char[] hexChars = new char[bytes.length * 2];
		char[] hexArray = "0123456789ABCDEF".toCharArray();
		for (int j = 0; j < bytes.length; j++) {
			int v = bytes[j] & 0xFF;
			hexChars[j * 2] = hexArray[v >>> 4];
			hexChars[j * 2 + 1] = hexArray[v & 0x0F];
		}
		return new String(hexChars);
	}

	public Long getCurrenDateMillis() {
		Calendar calendar = Calendar.getInstance();
		return calendar.getTimeInMillis();
	}

	public byte[] getBytesFromFile(File file) throws IOException {
		// Get the size of the file
		long length = file.length();

		// You cannot create an array using a long type.
		// It needs to be an int type.
		// Before converting to an int type, check
		// to ensure that file is not larger than Integer.MAX_VALUE.
		if (length > Integer.MAX_VALUE) {
			// File is too large
			throw new IOException("File is too large!");
		}

		// Create the byte array to hold the data
		byte[] bytes = new byte[(int) length];

		// Read in the bytes
		int offset = 0;
		int numRead = 0;

		InputStream is = new FileInputStream(file);
		try {
			while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
				offset += numRead;
			}
		} finally {
			is.close();
		}

		// Ensure all the bytes have been read in
		if (offset < bytes.length) {
			throw new IOException("Could not completely read file " + file.getName());
		}
		return bytes;
	}

	public String tsToString(Timestamp ts) {
		return new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(ts);
	}

	public Timestamp strToTimestamp(String fecha) {
		Date d = null;
		try {
	        if (fecha.matches( "[0-9]{4}-[0-9]{2}-[0-9]{2}[T ][0-9]{2}:[0-9]{2}:[0-9]{2}" )) {
	    		// ExtJS
	            fecha = fecha.replace( 'T', ' ' );
	            d = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" ).parse( fecha );
	        } else if (fecha.matches( "[0-9]{4}-[0-9]{2}-[0-9]{2}[T ][0-9]{2}:[0-9]{2}:[0-9]{2}[.][0-9]{3}[Z]" )) { 
	        	// JavaScript: Saca la T y corta Time Zone
	            fecha = fecha.replace( 'T', ' ' ).substring( 0, 19 );
	            d = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" ).parse( fecha );
	        }
		} catch (Exception e) {
			err.println("No se pudo convertir fecha string a ts");
		}
		if(d==null)
			return null;
		return new Timestamp(d.getTime());
	}


	public void saveFile(String path, byte[] data) throws IOException {
		OutputStream os = new FileOutputStream(path);
		os.write(data);
		os.close();
	}

	public Timestamp getYearBefore() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		// diez años atras
		cal.add(Calendar.YEAR, -10);
		return new Timestamp(cal.getTime().getTime());
	}

	public Timestamp getCurrenDate() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		return new Timestamp(cal.getTime().getTime());
	}

	public byte[] desencriptar(byte[] encrypted) throws InvalidKeyException, NoSuchAlgorithmException,
			NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		return decrypt(encrypted, Constantes.KEY_AES);

	}

	public String desencriptar(String b64)
			throws InvalidKeyException, UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		return new String(decrypt(Base64.decode(b64), Constantes.KEY_AES), "UTF-8");
	}

	public String encriptar(String anyString) throws InvalidKeyException, NoSuchAlgorithmException,
			NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		return new String(Base64.encode(encrypt(anyString, Constantes.KEY_AES)));
	}

	public String encriptar(byte[] certificado) throws InvalidKeyException, NoSuchAlgorithmException,
			NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		return new String(Base64.encode(encrypt(certificado, Constantes.KEY_AES)));
	}

	public String desencriptar(String b64, String keyAES)
			throws InvalidKeyException, UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		return new String(decrypt(Base64.decode(b64), keyAES), "UTF-8");
	}

	public String encriptar(String anyString, String keyAES) throws InvalidKeyException, NoSuchAlgorithmException,
			NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		return new String(Base64.encode(encrypt(anyString, keyAES)));
	}

	public String getDiaMesAno() {
		// se obtiene dia mes año
		Date date = new Date(); // your date
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		return day + "" + month + "" + year;
	}

	public String formatXSL(String str) {
		String resultado = str;
		resultado = resultado.replace("Á", "&#193;");
		resultado = resultado.replace("á", "&#225;");
		resultado = resultado.replace("É", "&#201;");
		resultado = resultado.replace("é", "&#233;");
		resultado = resultado.replace("Í", "&#205;");
		resultado = resultado.replace("í", "&#237;");
		resultado = resultado.replace("Ó", "&#211;");
		resultado = resultado.replace("ó", "&#243;");
		resultado = resultado.replace("Ú", "&#218;");
		resultado = resultado.replace("ú", "&#250;");
		resultado = resultado.replace("Ñ", "&#209;");
		resultado = resultado.replace("ñ", "&#241;");
		resultado = resultado.replace("°", "&#176;");
		resultado = resultado.replace("º", "&#186;");
		return resultado;
	}

	public String formatXML(String str) {
		String resultado = str;
		resultado = resultado.replace("Á", "&#193;");
		resultado = resultado.replace("á", "&#225;");
		resultado = resultado.replace("É", "&#201;");
		resultado = resultado.replace("é", "&#233;");
		resultado = resultado.replace("Í", "&#205;");
		resultado = resultado.replace("í", "&#237;");
		resultado = resultado.replace("Ó", "&#211;");
		resultado = resultado.replace("ó", "&#243;");
		resultado = resultado.replace("Ú", "&#218;");
		resultado = resultado.replace("ú", "&#250;");
		resultado = resultado.replace("Ñ", "&#209;");
		resultado = resultado.replace("ñ", "&#241;");
		resultado = resultado.replace("°", "&#176;");
		resultado = resultado.replace("º", "&#186;");
		resultado = resultado.replace("'", "&#39;");
		return resultado;
	}

	public ByteArrayOutputStream streamToBaos(InputStream is) {
		ByteArrayOutputStream baos = null;
		try {
			baos = new ByteArrayOutputStream();
			byte[] buffer = new byte[2048];
			int read = 0;
			while ((read = is.read(buffer, 0, buffer.length)) != -1) {
				baos.write(buffer, 0, read);
			}
			baos.flush();
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
		return baos;
	}

	public byte[] addWatermark(byte[] byteArray) throws IOException {

		InputStream is = new ByteArrayInputStream(byteArray);
		InputStream is2 = new ByteArrayInputStream(byteArray);

		BufferedImage image = ImageIO.read(is);
		BufferedImage overlay = ImageIO.read(is2);

		// create the new image, canvas size is the max. of both image sizes
		int w = Math.max(image.getWidth(), overlay.getWidth());
		int h = Math.max(image.getHeight(), overlay.getHeight());
		BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);

		// paint both images, preserving the alpha channels
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		Graphics g = combined.getGraphics();
		g.drawImage(image, 0, 0, null);
		g.drawImage(overlay, 0, 0, null);
		ImageIO.write(combined, "PNG", baos);
		return baos.toByteArray();
	}

	public X509Certificate getCertFromFile(String path) {
		X509Certificate cert = null;
		try {
			File certFile = new File(path);
			if (!certFile.canRead()) {
				throw new IOException(" File " + certFile.toString() + " is unreadable");
			}
			FileInputStream fis = new FileInputStream(path);
			CertificateFactory cf = CertificateFactory.getInstance("X509");
			cert = (X509Certificate) cf.generateCertificate(fis);
		} catch (Exception e) {
			System.out.println("Can't construct X509 Certificate. " + e.getMessage());
		}
		return cert;
	}

	public String fileToString(String pathname) throws IOException {
		File file = new File(pathname);
		StringBuilder fileContents = new StringBuilder((int) file.length());
		Scanner scanner = new Scanner(file);
		String lineSeparator = System.getProperty("line.separator");
		try {
			while (scanner.hasNextLine()) {
				fileContents.append(scanner.nextLine() + lineSeparator);
			}
			return fileContents.toString();
		} finally {
			scanner.close();
		}
	}

	public Integer countLines(String str) {
		String[] lines = str.split("\n");
		return lines.length;
	}

	public String getTimestampCGR() {
		String strCGR = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(getCurrenDate());
		strCGR = strCGR.replace("-0300", "-03:00");
		strCGR = strCGR.replace("-0400", "-04:00");
		// System.out.println(Calendar.getInstance(TimeZone.getTimeZone("GMT")).get(Calendar.ZONE_OFFSET)
		// + " Hours");
		return strCGR;
	}

	public Integer randomToNumber(Integer numero) {
		Random rand = new Random();
		return rand.nextInt(numero);
	}

	public Boolean validarRut(String rut) {

		boolean validacion = false;
		try {
			rut = rut.toUpperCase();
			rut = rut.replace(".", "");
			rut = rut.replace("-", "");
			if (rut.length() <= 7) {
				return false;
			}
			int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

			char dv = rut.charAt(rut.length() - 1);
			int m = 0, s = 1;
			for (; rutAux != 0; rutAux /= 10) {
				s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
			}
			if (dv == (char) (s != 0 ? s + 47 : 75)) {
				validacion = true;
			}
		} catch (Exception e) {
			validacion = false;
		}
		return validacion;
	}

	public String getCodigoVerificacion() {
		// Random random = new Random();
		// Character c = (char)(random.nextInt(26) + 'a');
		// Integer numeroAleatorio = random.nextInt(5000000);
		return getCurrenDateMillis().toString();
	}

	public Boolean isBase64(String stringBase64) {
		String regex = "([A-Za-z0-9+/]{4})*" + "([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)";

		Pattern patron = Pattern.compile(regex);

		if (stringBase64.length() <= 32) {
			return false;
		}

		if (!patron.matcher(stringBase64).matches()) {
			return false;
		} else {
			return true;
		}
	}

	public Boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		Utilidades ut = new Utilidades();
		System.out.println(ut.encriptar("backend_qa"));
		System.out.println(ut.encriptar(".b4ck3nd*"));
		System.out.println(ut.desencriptar("iCNjcH6ZmOlqXaLnd226B3SYRtI4Y1UkzQrCALZnfos="));
		System.out.println(ut.validarRut("6665236-K"));
	}
}
