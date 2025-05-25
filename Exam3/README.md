<div align="center">
  
<h1 align="center">Andres Felipe Chavarro Plazas</h1>

</br>

<p align="center">
Parcial final Grupo 1
</p>

</div>

</br>


## Modelo de clases

En esta aplicacion unicamente vamos a tener las siguientes 3 clases, las cuales contienen la informacion necesaria para poder modelar internamente todas las entidades que participan en este sistema. Asi, obtenemos una clase de usuarios para poder almacenar toda la informacion necesaria de las muchas citas que puede realizar, que estas ultimas, contienen una especialidad y los doctores que existen para ella.

![Diagrama sin título](https://github.com/user-attachments/assets/a97e73d6-5933-41fc-af8f-f710c62f42c0)

</br>


## Modelo de datos

Al ser una base no relacional, simplemente especificamos los documentos que usaremos para cada una de las entidades mencionadas antes en el diagrama de clases. Ademas relacionalos los datos de forma referenciada, lo que nos permite mantener claridad del funcionamiento de todas las interacciones de los documentos.


## Diagrama de componente

En este diagrama vamos a partir de un front que ingresara mediante peticiones http a nuestro servicio, cuando estas entran, el controlador es el responsable de recivirlas y hacer uso del componente de servicio, que contiene la logica necesaria para el funcionamiento de la aplicacion. Asi mismo, los servicios llaman a los repositorios, estos componentes hacen uso de la base de datos para la persistencia de estos. En este proceso, se retorna la informacion solicitada desde el front.

![Diagrama sin título(1)](https://github.com/user-attachments/assets/a7e39d89-b90e-4023-b69f-3afc6dedb991)

## Despliege
El despliege esta hecho en Azure, en este vamos a realizar todo lo necesario para que se pueda acceder desde la internet al servicio haciendo uso de las peticiones http, ya sea por consola o postman.

![imagen](https://github.com/user-attachments/assets/d2ba3761-09cf-499d-974b-573564404f7f)

![imagen](https://github.com/user-attachments/assets/976f176a-8d53-40e7-b820-3d1449bd47db)


## Pruebas unitarias
En esta app se manejo un umbral del 60% de covertura minima para que se concidere como valido para un despliege, en esta imagen de Jacooc podemos validar dicho objetivo.
![imagen](https://github.com/user-attachments/assets/dbe932b2-ea2f-4f95-8907-856eb54de979)
