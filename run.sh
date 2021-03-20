#!/bin/bash
RUTA=$(dirname $0)
if [ "$RUTA" != "." ] ; then
    cd "$RUTA"
fi

echo RUTA $RUTA
echo PWD $PWD

if git pull | grep -q '^Ya est' ; then
	echo "No hay cambios"
else
	echo "Actualizando ... "
	./gradlew compileJava
fi
# Certificados de prueba
# +-----+-----------------------------------------------------+--------------+
# | ID  | Nombre del Archivo pkcs12                           | Password     |
# +-----+-----------------------------------------------------+--------------+
# | 102 | /home/firmador/keys/certificado_bochagavia_test.p12 | 123456       |
# |  52 | /home/firmador/keys/testHSM.p12                     | Asdfgh954321 |
# +-----+-----------------------------------------------------+--------------+

#java -cp lib/*:build/classes/main to.noc.hsm.lunasa.example.KeyWrappingExample
#java -cp lib/*:build/classes/main to.noc.hsm.lunasa.example.WrappedKeySerializationExample
#java -cp lib/*:build/classes/main to.noc.hsm.lunasa.example.KeyWrappingWithHsmGeneratedKeysExample
#/home/firmador/keys/testHSM.p12 Asdfgh954321
#java -cp lib/*:build/classes/main to.noc.hsm.lunasa.example.LoadPrivateKey
#java -cp lib/*:build/classes/main to.noc.hsm.lunasa.example.WrapPrivateKey 52 /home/firmador/keys/testHSM.p12 Asdfgh954321
#<< LN_2_EMPTY #LN_2_EMPTY
#java -cp lib/*:build/classes/main to.noc.hsm.lunasa.example.TestEjbca
#java -cp lib/*:build/classes/main to.noc.hsm.lunasa.example.WrapPrivateKey 102 /home/firmador/keys/certificado_bochagavia_test_chain.p12 123456
java -cp lib/*:build/classes/main to.noc.hsm.lunasa.example.SavePrivateKey /home/firmador/keys/certificado_bochagavia_test_chain.p12 123456
