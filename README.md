# Inventory System — Backend

**Versión:** 1.0.0-SNAPSHOT  
**Última modificación:** 2 de abril de 2025  
**Estado:** En desarrollo

---

## Descripción

Backend para un sistema de gestión de inventario, desarrollado con **Spring Boot**. Expone una API RESTful para el control y seguimiento de productos, diseñada con principios de escalabilidad y seguridad.

---

## Tecnologías

| Tecnología     | Versión     |
|----------------|-------------|
| Java           | 17+         |
| Spring Boot    | 3.x         |
| Maven          | 3.8+        |
| Base de datos  | MySQL *(próximamente)* |

---

## Estructura del proyecto

```
inventory-system/
├── src/
│   ├── main/
│   │   ├── java/com/santiago/inventory_system/
│   │   │   └── InventorySystemApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/com/santiago/inventory_system/
│           └── InventorySystemApplicationTests.java
├── pom.xml
└── README.md
```

---

## Instalación y ejecución

**Requisitos previos:** Java 17+, Maven 3.8+

```bash
# Clonar el repositorio
git clone https://github.com/Vulkan2345/inventory-system-backend.git
cd inventory-system-backend

# Compilar el proyecto
mvn clean install

# Ejecutar la aplicación
mvn spring-boot:run
```

La aplicación quedará disponible en: `http://localhost:8080`

---

## Funcionalidades actuales

- Configuración inicial del proyecto con Spring Boot
- Servidor en ejecución en el puerto `8080`

---

## Roadmap

- [ ] API REST para gestión de productos (CRUD)
- [ ] Integración con base de datos MySQL
- [ ] Autenticación y autorización con JWT
- [ ] Documentación de endpoints con Swagger / OpenAPI

---

## Autor

**Santiago García**  
Desarrollador Backend  
[GitHub](https://github.com/Vulkan2345)

---

*Este proyecto se encuentra en desarrollo activo. Las funcionalidades y la estructura pueden cambiar en futuras versiones.*
