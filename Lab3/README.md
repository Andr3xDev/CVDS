# Laboratorio #3 CVDS

### :hammer: Crear Proyecto Maven
Para empezar, creamos un nuevo proyecto en Maven siguiendo los parametros dados con el comando 

`mvn archetype:generate -DgroupId=edu.eci.cvds -DartifactId=Library -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.0 -Dpackage=edu.eci.cvds.tdd -DinteractiveMode=false`

![image](https://github.com/user-attachments/assets/f077c5b8-a996-4b50-8c00-4514958fcbfe)


### ✔️ Agregar Dependencia JUnit5
Editamos el archivo `pom.xml` y agregamos la dependencia de JUnit5 en su última versión `5.11.4` y verificamos las propiedades 

![image](https://github.com/user-attachments/assets/98ae3f5b-9a71-464c-b5d1-4a2017f9bea1)

Compilamos y validamos

![image](https://github.com/user-attachments/assets/3672b21c-53f0-4ec0-8375-6e7b56f18b1e)

### :computer: Agregar Esqueleto del Proyecto
Agregamos los pauqeutes sugeridos `Library` -> `Book`, `Loan` y `User`y Verificamos que se crea su correspondiente en test

![image](https://github.com/user-attachments/assets/8bc11f68-1a61-40c0-b6a0-3d3592f58862)

### :keyboard: Agrregar Clases
Una vez creados los paquetes, creamos y añadimos el código de las clases sugeridas en surespectivo paquete:
`library.book -> Book`

`library.loan -> Loan y LoanStatus`

`library.user -> User`

`library -> Library`

![image](https://github.com/user-attachments/assets/1bdc1f49-00a2-474c-a470-b15a2ffa4e09)


## Pruebas Unitarias y TDD

### 📊 Cobertura
Editamos el archivo `pom.xml` agregando la dependencia de Jacoco con la estructura sugerida y en su última versión `0.8.12`

![image](https://github.com/user-attachments/assets/388606ed-ce73-4274-8caa-26e52c4335f5)

Verificamos...

![image](https://github.com/user-attachments/assets/17241dcc-a4ba-494d-afa2-aada6ac0c9d8)

Ya con el sistema listo, podemos desarrollar las pruebas unitarias necesarias para tener la cobertura de código objetivo. Además, tenemos que terminar un fragmento de código en la clase de Library, donde la gracia es aplicar el principio de TDD desarrollando las pruebas y luego el código.
Como podemos ver, al finalizar las pruebas tenemos una cobertura casi perfecta. El porcentaje que menor está, es porque nos hace falta un par de test para comprobar todas las opciones de fallo.

![image](https://github.com/user-attachments/assets/d32a9277-077e-4c14-a661-e5db31c5ffe2)

### SonarQube
Siguiendo la guía, usamos Docker para descargar la imagen de Sonar y poder ejecutar en local la herramienta de análisis de código estático. Como se muestra a continuación, no mostró problemas y pudimos validar su funcionamiento.

![image](https://github.com/user-attachments/assets/a8e8f862-4dd3-4a46-a004-2a05f1e798d8)


![image](https://github.com/user-attachments/assets/b2a52991-5326-4c53-b756-cd56e17125ad)

Ya validado que la herramienta funciona, vamos a ingresar con el usuario y contraseña "admin" para poder solicitar un token que nos ayudará a que las extensiones de nuestro IDE nos identifique y permita realizar el análisis de código.

![image](https://github.com/user-attachments/assets/ad8d2ed9-f9b8-4b68-a541-c906d6377322)

Ya con el token configurado, colocamos los plugins necesarios y las propiedades para que funcione correctamente Sonar. De este modo, nos queda la siguiente configuración.

![image](https://github.com/user-attachments/assets/4911b17b-5298-43ff-aae5-33b9f40a0f94)

Finalmente, podemos reconstruir el proyecto y hacer que Sonar se ejecute y nos dé el resultado que esperamos para saber si nuestro código está bien hecho y que tenga una buena cobertura.

![image](https://github.com/user-attachments/assets/0e385bae-6a82-43ac-9e37-329622eae472)

Como se aprecia en la imagen, el código pasó la prueba de forma satisfactoria y tuvimos una captura de código muy buena. Únicamente podemos mejorar con un par de tests, que nos permitan cubrir casos fijos que podrían llegar a generar un fallo. Por lo demás, no hubo problemas de acoplamiento o de malas prácticas que signifiquen algo grave.
