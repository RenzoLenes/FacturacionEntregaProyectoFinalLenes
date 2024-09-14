# Sistema de Facturación - Entrega Final

Este proyecto es una API REST desarrollada en **Spring Boot** que gestiona un sistema de facturación, permitiendo realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre las entidades `Cliente`, `Producto`, `Venta`, y `VentaProducto`. La API está documentada utilizando **Swagger** y se encuentra estructurada en controladores que gestionan las rutas y servicios para cada entidad.

## Entidades y Endpoints

### 1. Cliente
Esta entidad representa a los clientes de la aplicación de facturación. Los clientes pueden ser gestionados a través de los siguientes endpoints:

- **GET /clientes**: Retorna una lista de todos los clientes.
- **GET /clientes/{id}**: Busca un cliente por su ID.
- **POST /clientes**: Crea un nuevo cliente.
- **PUT /clientes**: Modifica un cliente existente.
- **DELETE /clientes/{id}**: Elimina un cliente por su ID.

### 2. Producto
La entidad `Producto` maneja los productos que pueden ser facturados en una venta.

- **GET /productos**: Retorna una lista de todos los productos.
- **GET /productos/{id}**: Busca un producto por su ID.
- **POST /productos**: Crea un nuevo producto.
- **PUT /productos**: Modifica un producto existente.
- **DELETE /productos/{id}**: Elimina un producto por su ID.

### 3. Venta
La entidad `Venta` maneja las ventas realizadas por los clientes. Cada venta está asociada a uno o más productos.

- **GET /ventas**: Retorna una lista de todas las ventas.
- **GET /ventas/{id}**: Busca una venta por su ID.
- **POST /ventas**: Crea una nueva venta.
- **PUT /ventas**: Modifica una venta existente.
- **DELETE /ventas/{id}**: Elimina una venta por su ID.

### 4. VentaProducto
La entidad `VentaProducto` asocia las ventas con los productos, indicando qué productos están presentes en cada venta.

- **GET /VentaProductos**: Retorna una lista de todas las relaciones de ventas con productos.
- **GET /VentaProductos/{id}**: Busca una relación de venta con producto por su ID.
- **POST /VentaProductos**: Crea una nueva relación entre una venta y un producto.
- **PUT /VentaProductos**: Modifica una relación existente.
- **DELETE /VentaProductos/{id}**: Elimina una relación por su ID.

## Documentación con Swagger

La API cuenta con **Swagger** para facilitar la documentación y el testing de los endpoints. Puedes acceder a la interfaz gráfica de Swagger en la siguiente URL, una vez que el proyecto esté corriendo:

[http://localhost:8081/swagger-ui/index.html#/](http://localhost:8081/swagger-ui/index.html#/)

Esto te permitirá ver todos los endpoints disponibles y realizar pruebas directamente desde el navegador.

## Configuración de Base de Datos y Puerto

La aplicación está configurada para correr en el puerto **8081** y se conecta a una base de datos **PostgreSQL**. A continuación se muestra la configuración del archivo `application.properties`:

```properties
# Configuración de JPA y base de datos PostgreSQL
spring.jpa.database=postgresql
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update

# Configuración de conexión a PostgreSQL
spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://localhost/coderHouse
spring.datasource.username=postgres
spring.datasource.password=12345678

# Configuración del puerto del servidor
server.port=8081
```

## Tecnologías Utilizadas

- **Java 17**
- **Spring Boot**
- **Swagger** para la documentación de la API.
- **PostgreSQL** para la base de datos.
- **Maven** para la gestión de dependencias.
- **Postman** o **Swagger UI** para pruebas y verificación de la API.

## Ejecución del Proyecto

Para correr el proyecto localmente, sigue estos pasos:

1. Clona el repositorio desde GitHub:
   ```bash
   git clone https://github.com/RenzoLenes/FacturacionEntregaProyectoFinalLenes.git
   ```

2. Navega al directorio del proyecto:
   ```bash
   cd FacturacionPrimeraEntregaLenes
   ```

3. Configura la base de datos PostgreSQL y asegúrate de que esté corriendo en el puerto correcto, o ajusta la URL de conexión en `application.properties` si es necesario.

4. Compila y ejecuta el proyecto usando Maven:
   ```bash
   mvn spring-boot:run
   ```

5. La API estará disponible en `http://localhost:8081`, y la documentación de Swagger estará en [http://localhost:8081/swagger-ui/index.html#/](http://localhost:8081/swagger-ui/index.html#/).

## Pruebas

Puedes usar **Postman** o la interfaz de **Swagger UI** para realizar pruebas de los diferentes endpoints descritos arriba.

## Contribuciones

Si quieres contribuir a este proyecto, puedes hacer un fork y crear un pull request con tus mejoras.

---
