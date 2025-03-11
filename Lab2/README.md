<div align="center">
<h1 align="center">CVDS-LAB2</h1>
  <p align="center">
    Utilizacion de Maven e integracion con git
    <br />
  </p>
</div>
</br>

## Colaboradores
- Nicole Dayan Calderón Arévalo
- Andrés Felipe Chavarro Plazas

</br>

## :hammer: Construcción

#### Proceso de construcción de proyecto en Maven:
En la creación de proyecto con Maven, iniciamos buscando y aplicando los comandos sugeridos en el laboratorio para crear el proyecto con ayuda de los arquetipos

![image](https://github.com/user-attachments/assets/b8420a50-2b4d-4700-8dd5-8c4ff3403ff7)

Confirmamos la correcta creación de  Patterns

![image](https://github.com/user-attachments/assets/a3c6f8d6-f8ec-43a3-a26d-83cbe45e638b)

Revisamos la estructura de los directorios y archivos con `tree`

![image](https://github.com/user-attachments/assets/336f1490-2670-4ea8-9d12-5eb3589d3a66)

Ahora ajustamos algunas configuraciones del proyecto, editando el archivo `pom.xml`

![image](https://github.com/user-attachments/assets/6654d7b8-6636-499d-9acd-7b7b17f967bd)
![image](https://github.com/user-attachments/assets/fe3db421-473b-4017-a14f-cc01cbf2714f)

</br>

## :hammer_and_wrench: Compilar y Ejecutar
Despues de compilar correctamente con el comando `mvn package`

Ejecutamos con `mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.archetype.App"`
y comprobamos que se ejecuta correctamente

![image execute hello world](https://github.com/user-attachments/assets/940e7d34-1973-4f3d-9bc1-cb534d958f51)

Ahora cambiamos la clase `App.java` y añadimos la posibilidad de un saludo personalizado para nombre y nombre-apellido:

Ejecutamos con `mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.archetype.App" -Dexec.args="Nicole"`
Y obtenemos correctamente

![image execute hello name](https://github.com/user-attachments/assets/ca378c4b-9aae-4866-b4cd-dfdead15c8d0)

Ahora ejecutammos con `mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.archetype.App" -Dexec.args="Nicole Calderon"`
Y comprobamos su funcionamiento

![image execute hello name-last name](https://github.com/user-attachments/assets/44ed8a49-dcd8-4b42-9e03-3039c970e543)

En cada uno de los cambios al código se compila nuevamente con `mvn package`

</br>

## :heavy_check_mark: Herramienta Maven

![image Maven](https://github.com/user-attachments/assets/76a37497-d974-4532-b6a9-420062606292)

#### ¿Cúal es su mayor utilidad?
- Permitir al desarrollador comprender el estado del proyecto durante todo su cliclo de vida, de una forma rapida y estandarizada

#### Fases de Maven
- Para un default lifecycle se tienen las siguientes 7 fases:
  1. `Validate` -> Valida que el proyecto este correcto y que toda la información necesaria este diponible
  2. `Compile` -> Compila el código fuente del proyecto
  3. `Test` -> Prueba el código compilado usando un marco de pruebas unitarias
  4. `Package` -> Empaqueta el código compilado en un formato ditribuible
  5. `Verify` -> Verifica los resultados de las pruebas de integración para que cumpla con los criterios de calidad
  6. `Install` -> Instala el paquete en el repositorio local
  7. `Deploy` -> Copia el paquete final en el repositorio remoto
  
#### Ciclos de vida de la construcción
En Maven, el ciclo de vida de construcción de un proyecto esta compuesto por fases, plugins y goals donde cada parte cumple una tarea en el proceso de construcción. En el caso del ciclo de vida Default su ciclo de vida es el siguiente:

![image default lifecycle](https://github.com/user-attachments/assets/e22a6e2e-7812-4f5d-9f21-d97054c3b5ac)

Maven cuenta con 3 ciclos de vida de construcción que son: Default, Clean y Site

#### ¿Para qué sirven `los plugins`?
- Los plugins son colecciones empaquetadas que sirven para reutilizar lógica y ejecutar acciones cuando aún no son descargados. Segun Maven sirven tambien para crear archivos JAR, archivos WAR, compilar codigo, hacer pruebas unitarias,etc. Es decir que son utiles en todo el proyecto
  
#### ¿Qué es? y ¿para qué sirve el repositorio central de maven?
- Maven Central es un repositorio de codigo abierto y el principal registro de software, complementos, bibliotecas y marcos de Java. Permite a los desarrolladores gestionar las dependencias de sus proyectos de manera eficaz

</br>

## ✏️ Fábrica
Al revisar y comparar nosotros decidimos atender a `Simple Factory` debido a es el que mejor se alinea con la estructura que tenemos. En este caso, la clase `ShapeMain` contiene una clase `factory` que crea los elementos con ayuda del parametro dado al ejecutar la clase. Para ello creamos dicha clase y con ayuda de un swich podemos dar diversas opciones para la creacion de las clases. Por otro lado, usamos la clase dada para la enumeracion o identificacion de parametros dados en la clase main para poder garantizar que los parametros sean lejibles para un swich.

</br>

## 💻 Desarrollo y Aplicación
Creamos la aplicación siguiendo todas las sugerencias entregadas en el laboratorio, como se puede evidenciar. En los archivos de este repositorio se encuentra la aplicación creada de Shapes y en este documento se agrgaran las pruebas realizadas

![Imagen](https://github.com/user-attachments/assets/1b4c171a-7d12-4e92-8c31-8b006115e084)

![Imagen d](https://github.com/user-attachments/assets/65494c33-9838-4aae-b231-6f62f883b18b)

![Imagena](https://github.com/user-attachments/assets/f3179915-b345-4efc-9663-53b87f33f4db)

Evidenciamos que funciona correctamente respecto al código proporcionado

</br>

## Archivo ignore
En git, tenemos la opcion de crear un archivo de nombre *.gitignore*. Este esta diseñado para indicar que archivos o directorios van a ser considerados como validos para subir al repositorio remoto. Aquellos archivos excluidos, seran ignorados por completo en el momento de realizar un `git add (ALGO)`. Esto es algo muy util cuando se manejan proyectos donde se tiene que construir el codigo para su correcto funcionamiento como es el caso de la carpeta *target* con maven o *.env* usando python, ademas, evitamos subir archivs que se crean con el proyecto y hacemos que el repositorio sea mas lijero y mas limpio.
