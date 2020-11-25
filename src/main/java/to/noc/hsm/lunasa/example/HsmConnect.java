package to.noc.hsm.lunasa.example;

import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Security;
import java.security.Signature;

import com.safenetinc.luna.LunaSlotManager;

public class HsmConnect {
	private static final LunaSlotManager slotManager;

	static {
		Security.addProvider(new com.safenetinc.luna.provider.LunaProvider());
		slotManager = LunaSlotManager.getInstance();
		slotManager.setSecretKeysExtractable(false);
	}

	public static void main(String[] args) throws Exception {
		KeyStore ks = KeyStore.getInstance("Luna");

		Key key = ks.getKey("signing key", null);
		Signature sig = Signature.getInstance("SHA1withRSA", "LunaProvider");
		sig.initSign((PrivateKey) key);

	}

}
