# HsmKeyWrappingExample
Este código muestra ejemplos simples para probar con __key wrapping__
en SafeNet Luna SA HSM sobre AWS CloudHSM de Amazon.

## ¿Por qué esto es interesante?
Si solo se está administrando, digamos 20k claves, se pueden almacenar en Luna
SA HSM. Cada clave es almacenada físicamente en el HSM y es accedida utilizando
un String ID.

La administración de un mayor número de claves se realiza normalmente almacenando
versiones cifradas de esas claves fuera del HSM. Una Key Encription Key (KEK) se
almacena en el HSM para generar la clave de host cifrada.

## Como usar este código

1) Crear una partición de prueba en su HSM y grabar esa partición con Nombre y Password.

2) Crear un arhcivo __partition.properties__ en su directorio HOME, incluyendo las 2
propiedades siguientes: 

```
partitionName = YourTestPartitionName
partitionPass = PasswordForYourTestPartition
```

3) Desde un host cliente Linux HSM con el software cliente Luna SA JSP instalado:

```
$ git clone https://github.com/dimalinux/HsmKeyWrappingExample.git
$ cd HsmKeyWrappingExample

$ ./gradlew clean run
# Or:
$ ./gradlew clean build
$ java -Djava.library.path=/usr/lunasa/jsp/lib -cp build/libs/HsmKeyWrappingExample.jar:/usr/lunasa/jsp/lib/LunaProvider.jar to.noc.hsm.lunasa.example.KeyWrappingExample
```

4) Para ejecutar uno de los ejemplos alternativos, intercambie la clase principal declarada en
el archivo __build.gradle__ o la clase principal en la línea de comando si se está invocando java
directamente.
