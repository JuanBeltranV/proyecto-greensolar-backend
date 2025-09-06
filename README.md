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

## 📂 Estructura del proyecto

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


