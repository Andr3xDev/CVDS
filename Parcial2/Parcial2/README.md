<div align="center">
    <h1 align="center">Parcial 2</h1>
    <p align="center">
        Andres Felipe Chavarro Plazas
    </p>
</div>

</br>

## Acerca del proyecto
En este parcial se nos pidio crear una aplicacion sensilla que unicamente registrara las facturas de compra en una tienda. Por indicaciones del profesor de lab, solamente se creo la clase referente a las facturas. Pues, los productos como tal se simulan como existentes, es decir no tenemos que tener un inventario, mismo caso que los usuarios. Por ende, el resultado es bastante corto en comparacion a una app normal. 

</br>

## Instalación y configuración

Antes de descargar este repositorio, asegúrese de tener instalado:  
- **Java 17+**  
- **Maven 3.9.x**

Luego tienes que clonar el repositorio:
```sh
git clone https://github.com/Andr3xDev/Parcial2
cd Parcial2
```

Ahora, usamos Mongo Atlas como sistema de base de datos. Para cambiarlo, introduzca la URI de conexión proporcionada por el administrador del clúster y reemplácela en la configuración de la API. Esta se encuentra en el directorio de recursos y en el archivo de configuración.
Finalmente, empaquete y descargue las dependencias con la aplicación con Maven y ejecute la aplicación:
```sh
mvn clean package verify
```

</br>

## Project Structure

### General

El proyecto sigue una estructura modular para garantizar la mantenibilidad y la escalabilidad. A continuación, se describe la estructura de los directorios y archivos principales de una **API REST**:

- **controller/**: Define los controladores que gestionan las solicitudes HTTP y la comunicación entre el frontend y el backend.
- **service/**: Contiene la lógica de negocio de la aplicación. Esta capa procesa los datos antes de interactuar con la capa de persistencia.
- **repository/**: Gestiona las interacciones con la base de datos y proporciona métodos para realizar operaciones CRUD en las entidades.
- **model/**: Define las entidades y las estructuras de datos utilizadas en la aplicación.
- **config/**: Contiene configuraciones personalizadas, como la configuración de seguridad, las conexiones a la base de datos y la gestión de CORS.
- **src/main/resources/**: Archivos de configuración y recursos estáticos.
- **src/test/java/**: Contiene pruebas unitarias y de integración.

Esta estructura garantiza una clara separación de preocupaciones, lo que hace que el desarrollo y el mantenimiento de la API REST sean más eficientes.

</br>

### Data Model
La estructura de los datos que se almacenan en la persistencia ya está definida y, en teoría, se ajusta desde el front-end para garantizar su correcto funcionamiento.
Contamos con una unica base de datos en nuestro clúster. La cual, que funcionará perfectamente para cumplir el objetivo de la app. En esta base de datos, tenemos los siguientes documentos:

- **Payments**: Datos relacionados con las reservas realizadas por un usuario.

```json
{
    "id": <AUTOGEN>,
    "user": <String>,
    "products": {
      {name:<String>, price:<Int>, quantity:<Int>}
    },
    "totalPrice": <Int>,
    "date": <Date>
}

```

EJEMPLO:

```json
{
    "_id": {
        "$oid":"67d15664e4df91310a73ccdc"
    },
    "user": "Juanito Alimaña",
    "products": {
      {name:"Memoria ram", price:100, quantity:2}
    },
    "totalPrice": 200,
    "date": 3/27/2025
}
```

#### Modelo de clases

Este es el modelo diseñado y utilizado como referencia para la base de datos creada en MongoDB. Además, funciona como modelo de datos físicos.

![imagen](https://github.com/user-attachments/assets/dca74f57-cfd6-47d4-befd-b73244ada286)


</br>
</br>

## Endpoints
Para que la aplicación sea más fácil de entender, en esta sección resumiremos todos los posibles endpoints para usar en cualquier frontend.

### Reserves

</br>


#### `GET /api/{id}`
- **Descripción**: Recuperar una factura por ID
- **Parámetros de ruta**:
- `id`: ID de la factura a recuperar.
- **Respuesta correcta**:
    ```json
  {
    "_id": {
        "$oid":"67d15664e4df91310a73ccdc"
    },
    "user": "Juanito Alimaña",
    "products": {
      {name:"Memoria ram", price:100, quantity:2}
    },
    "totalPrice": 200,
    "date": 3/27/2025
  }
    ```
- **Respuestas de error**:
  404 No encontrado: No se encontró la reserva con el ID especificado.

Ejemplo validado con postman:

![image](https://github.com/user-attachments/assets/7b4c5937-eb0c-4547-b045-33aed9da4511)


</br>


#### `POST /api/create`
**Descripción**: Crear una nueva factura.

**Cuerpo de la solicitud**:
    ```json
  {
    "user": "Juanito Alimaña",
    "products": {
      {name:"Memoria ram", price:100, quantity:2}
    },
    "totalPrice": 200,
    "date": 3/27/2025
  }
    ```
- **Successful Response**:
    ```json
    {
    "_id": {
        "$oid":"67d15664e4df91310a73ccdc"
    },
    "user": "Juanito Alimaña",
    "products": {
      {name:"Memoria ram", price:100, quantity:2}
    },
    "totalPrice": 200,
    "date": 3/27/2025
  }
    ```
**Respuestas de error**:
  400 Solicitud incorrecta: Datos de reserva no válidos.


Ejemplo validado con postman:

![image](https://github.com/user-attachments/assets/595a42a7-3be3-4fba-adbe-c5a7b6637efb)



</br>
</br>

## Test Driven Development
Utilizaremos este estándar de desarrollo con pruebas unitarias para optimizar el desarrollo de la aplicación. Por ejemplo, inicialmente se realizan pruebas unitarias y, obviamente, fallarán. Tras implementar el código sin modificar las pruebas, la aplicación debe poder empaquetarse sin generar errores.

![Jacoco test](/docs/jacoco.png)

</br>
</br>

## Despliegue Azure
Para el despliegue, usamos Azure Web Apps para poder acceder a la aplicacion desde el front. Esto es automatico y valido por el mismo funcionamiento de los pipelines, es decir, se aplico CD/CI de forma correcta y util para mantener produccion estable junto al desarrollo.

![image](https://github.com/user-attachments/assets/8d000fe8-5127-4d7d-b6e3-aa137a7546a8)

Se puede utilizar con el siguiente link de referencia para las consultas.

https://parcial2cvds20251-apfmh5ayg0b9fvag.canadacentral-01.azurewebsites.net/api
