# GreenSolar SPA – Backend (Spring Boot)

> ⚠**Aviso importante**  
> Este proyecto fue desarrollado como parte de un **trabajo universitario** para el ramo de **Ingeniería de Software** en Duoc UC.  
> El objetivo es demostrar conocimientos en **desarrollo backend**, **arquitectura REST**, **seguridad con JWT** y **documentación con OpenAPI**.  
> No está pensado para uso en producción.

---

## Descripción

**GreenSolar SPA** es un **microservicio backend** desarrollado en **Java + Spring Boot** que permite gestionar:
- **Productos**
- **Categorías**
- **Proveedores**

El proyecto integra **autenticación con JWT**, **documentación automática con Swagger/OpenAPI**, soporte para **HATEOAS** y persistencia de datos en **Oracle Database**.

---

## Tecnologías principales

| Tecnología          | Uso principal                     |
|---------------------|----------------------------------|
| **Java 17**         | Lenguaje principal               |
| **Spring Boot 3.5** | Framework backend                |
| **Spring Data JPA** | Persistencia en Oracle Database  |
| **Spring Security** | Autenticación con JWT            |
| **HATEOAS**         | Hipermedios en las respuestas    |
| **Swagger/OpenAPI** | Documentación de la API          |
| **JUnit / Mockito** | Pruebas unitarias                |
| **Maven**           | Gestión de dependencias          |

---

## Arquitectura del proyecto

El proyecto está basado en una **arquitectura en capas**:

src/main/java/
├── controller # Controladores REST + HATEOAS
├── service # Lógica de negocio
├── repository # Interfaces JPA para persistencia
├── model # Entidades JPA
└── config # Configuración (JWT, Swagger, Seguridad)


Endpoints principales
Método	Endpoint	Descripción
GET	/api/productos	Listar productos
POST	/api/productos	Crear un nuevo producto
PUT	/api/productos/{id}	Actualizar producto existente
DELETE	/api/productos/{id}	Eliminar producto
GET	/swagger-ui.html	Acceder a la documentación Swagger

Seguridad

JWT (JSON Web Token): Autenticación para rutas protegidas.

Spring Security: Manejo de roles y control de acceso.

Swagger/OpenAPI: Documentación interactiva con soporte para autenticación.

Pruebas unitarias

El proyecto incluye JUnit 5 y Mockito para probar servicios y controladores.
Para ejecutar los tests:

mvn test

Variables de entorno

Crea un archivo .env o configura las variables directamente para conectar tu base de datos:

DB_URL=jdbc:oracle:thin:@//host:1521/service
DB_USER=usuario
DB_PASS=contraseña
JWT_SECRET=CAMBIA_ESTE_VALOR


⚠️ Las credenciales en el repo son ficticias y solo ilustrativas.

Contexto académico

Este proyecto fue desarrollado como parte del ramo Ingeniería de Software en Duoc UC (2025), aplicando:

Metodologías ágiles (Scrum).

Documentación de API con Swagger/OpenAPI.

Buenas prácticas de diseño y pruebas unitarias.

Integración de base de datos Oracle Cloud.
