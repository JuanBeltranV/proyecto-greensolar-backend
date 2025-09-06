# GreenSolar SPA – Backend (Spring Boot)

> ⚠**Aviso importante**  
> Este proyecto fue desarrollado como parte de un trabajo universitario.  
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

## Estructura del proyecto

```bash
src/
├── controller/   # Endpoints REST y enlaces HATEOAS
├── service/      # Lógica de negocio
├── repository/   # Repositorios JPA
├── model/        # Entidades JPA
└── config/       # Configuración de seguridad, JWT y Swagger
pom.xml           # Configuración de dependencias Maven
README.md         # Este documento
.gitignore        # Archivos ignorados en Git
```

## Endpoints principales

| **Método** | **Endpoint**             | **Descripción**                  |
|-----------|---------------------------|----------------------------------|
| **GET**    | `/api/productos`         | Listar productos                |
| **POST**   | `/api/productos`         | Crear un nuevo producto         |
| **PUT**    | `/api/productos/{id}`    | Actualizar producto existente   |
| **DELETE** | `/api/productos/{id}`    | Eliminar producto              |
| **GET**    | `/swagger-ui.html`      | Acceder a la documentación Swagger |


## Seguridad

- **JWT (JSON Web Token):** Autenticación para proteger rutas y recursos.
- **Spring Security:** Manejo de roles, permisos y control de acceso.
- **Swagger/OpenAPI:** Documentación interactiva con soporte para autenticación.


## Pruebas unitarias

El proyecto incluye JUnit 5 y Mockito para probar servicios y controladores.
Para ejecutar los tests:
```bash
mvn test
```

