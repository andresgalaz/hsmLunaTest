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
#java -cp lib/*:build/classes/main to.noc.hsm.lunasa.example.KeyWrappingExample
#java -cp lib/*:build/classes/main to.noc.hsm.lunasa.example.WrappedKeySerializationExample
#java -cp lib/*:build/classes/main to.noc.hsm.lunasa.example.KeyWrappingWithHsmGeneratedKeysExample
#java -cp lib/*:build/classes/main to.noc.hsm.lunasa.example.LoadPrivateKey
#/home/firmador/keys/testHSM.p12 Asdfgh954321
#java -cp lib/*:build/classes/main to.noc.hsm.lunasa.example.SavePrivateKey $* 
java -cp lib/*:build/classes/main to.noc.hsm.lunasa.example.WrapPrivateKey /home/firmador/keys/testHSM.p12 Asdfgh954321 
# << LN_2_EMPTY
# 
# 
# LN_2_EMPTY
