<!-- PROJECT LOGO -->
<br />
<div align="center">

<h1 align="center">Laboratorio 1</h1>

  <p align="center">
    Manejo basico de git y github
    <br />
  </p>
</div>

</br>

> [!NOTE]
> La guia para desarrollar este trabajo es la siguiente: https://github.com/CVDS-ESCUELAING/Laboratory2025/blob/main/LAB01.md

</br>

## Colaboradores
Autores de este laboratorio:
- Andrés Felipe Chavarro Plazas
- Nicole Dayan Calderón Arévalo

</br>

## Respuestas parte individual

### 1. Creación del repositorio
Para comenzar, esta parte tiene como objetivo aprender los comandos básicos de git y su correcta vinculación con repositorios locales.
En primer lugar, vamos a crear un repositorio remoto en GitHub, para ello se selecciona la respectiva opción que nos manda a la pantalla
donde crearemos un repo completamente vacío, tal como se ve la siguiente imagen.

<p align="center">
  <img src="/Assets/create.png" alt="a">
</p>

### 2. Subida de archivos
Tras la creación, se nos da una serie de pasos sugeridos para realizar la conexión del repositorio remoto a uno local, donde podemos 
ver las siguientes opciones:
- Clonar el repositorio mediante el comando en consola `git clone` y la URL que nos proporcionan dependiendo si elegimos la opción
  HTTPS que simplemente es el link del repositorio, o por SSH que es mediante una clave que vincula el dispositivo con la cuenta de GitHub.
  A partir de este clon, se puede modificar el repositorio local generado.
- Crear un repositorio local en un directorio con el comando `git init`, para luego manipular este repositorio y vincularlo al remoto que
  creamos mediante el comando `git remote add`, de modo que al realizar un push se actualiza el repositorio remoto. También, se puede
  Únicamente generar y subir la rama principal al repositorio y de igual forma quedaría vinculado.

<p align="center">
  <img src="/Assets/init.png" alt="a">
</p>

En mi caso, mi computadora ya tenía las credenciales configuradas con anterioridad, por lo que conjunto a una clave SSH fue posible 
clonar el repositorio y manipularlo sin ningún tipo de restricción. De este modo se realizaron las siguientes acciones para completar
la primera parte del laboratorio:
- Clonar el repositorio mediante SSH y `git clone`.
- Crear el este archivo README.
- Validar es estado de los archivos con `git status`.
- Añadir archivos al área de preparación con `git add .`, siendo el punto el indicativo que afecte a todos los archivos nuevos, removidos o modificados.
- Realizar el commit para guardar los cambios de forma local.
- Subir el commit con los cambios al repositorio remoto con `git push`.

<p align="center">
  <img src="/Assets/clone.png" alt="a">
</p>
<p align="center">
  <img src="/Assets/comands.png" alt="a">
</p>

### 3. Comandos git
En Git, los cambios pasan por tres áreas: el directorio de trabajo, el área de preparación (staging area) y el repositorio. `git add` mueve los cambios desde el directorio de trabajo al área de preparación, permitiéndote elegir qué se incluirá en el próximo commit. Luego, `git commit` toma los cambios del área de preparación y los guarda de forma permanente en el repositorio, junto con un mensaje que describe las modificaciones realizadas con `-m "Mensaje"` seguido a lo anterior. Posteriormente, se usa `git push` para subir los cambios al repositorio remoto.


### 4. Ligar correo y credenciales
En un caso especial, hubiera tenido que usar los siguientes comandos para poder validar las credenciales de mi GitHub, pues estas son necesarias para comunicarse con
la plataforma que se esté usando para el repositorio remoto:
- `git config --global user.name "Tu Nombre"`.
- `git config --global user.email "tu_correo@example.com"`.

Donde el global es opcional, pues sin este solo se añaden las credenciales en el repositorio local. Ademas, el correo que se ponga tiene que estar vinculado con la cuenta de git.
para ello se configura en las configuraciones de la cuenta de git.

> [!NOTE]
> Para mas info esta la siguiente guia https://docs.github.com/es/account-and-profile/setting-up-and-managing-your-personal-account-on-github/managing-email-preferences/adding-an-email-address-to-your-github-account.


<p align="center">
  <img src="https://github.com/user-attachments/assets/18f3900a-75ce-42d4-b73d-cd37a465f3d2" alt="image">
</p>

Finalmente, se da por culminada la primera parte del laboratorio con este documento en sus primeras instancias y repitiendo el proceso para añadir la carpeta que alberga las imágenes.

</br>

## Parte en parejas

> [!IMPORTANT]
> Esta parte se reealizo en el repositorio de mi compañera
> https://github.com/NicoleC09/Laboratorio1_CVDS

Para esta parte se nos pidió generar conflictos al momento de subir algo al repositorio, con la intención de darles solución de forma manual y con ayuda de un IDE o editor de código que contara con las herramientas necesarias para el manejo de Git. Adicionalmente, se buscó que exploráramos y experimentáramos con las ramas del repositorio desde su creación, unificación y eliminación. 

</br>

## Contact

Andrés Felipe Chavarro Plazas -- andres.chavarro-p@mail.escuelaing.edu.co

Nicole Dayan Calderón Arévalo -- nicole.calderon-a@mail.escuelaing.edu.co
