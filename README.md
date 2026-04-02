# Inventory System — Backend

**Versión:** 1.1.0-SNAPSHOT  
**Última modificación:** 2 de abril de 2025  
**Estado:** En desarrollo

---

## Descripción

Backend para un sistema de gestión de inventario desarrollado con **Spring Boot**. Expone una API RESTful para el control y seguimiento de productos, con arquitectura en capas y datos simulados en memoria.

---

## Tecnologías

| Tecnología  | Versión |
|-------------|---------|
| Java        | 17+     |
| Spring Boot | 3.x     |
| Maven       | 3.8+    |

---

## Arquitectura

```
inventory-system/
├── src/main/java/com/santiago/inventory_system/
│   ├── controller/
│   │   └── ProductController.java      # Endpoints REST
│   ├── service/
│   │   └── ProductService.java         # Lógica de negocio
│   ├── model/
│   │   └── Product.java                # Entidad producto
│   └── InventorySystemApplication.java
└── pom.xml
```

---

## API REST — Productos

Base URL: `http://localhost:8080/api/products`

| Método     | Endpoint               | Descripción                 |
|------------|------------------------|-----------------------------|
| `GET`      | `/api/products`        | Listar todos los productos  |
| `GET`      | `/api/products/{id}`   | Obtener producto por ID     |
| `POST`     | `/api/products`        | Crear nuevo producto        |
| `PUT`      | `/api/products/{id}`   | Actualizar producto por ID  |
| `DELETE`   | `/api/products/{id}`   | Eliminar producto por ID    |

### Ejemplo de cuerpo (POST / PUT)

```json
{
  "name": "Laptop",
  "price": 1200.00,
  "quantity": 10
}
```

---

## Instalación y ejecución

**Requisitos previos:** Java 17+, Maven 3.8+

```bash
# Clonar el repositorio
git clone https://github.com/Vulkan2345/inventory-system-backend.git
cd inventory-system-backend

# Ejecutar la aplicación
./mvnw spring-boot:run
```

La aplicación quedará disponible en: `http://localhost:8080`

---

## Roadmap

- [x] Configuración inicial del proyecto
- [x] API REST — CRUD de productos
- [x] Arquitectura en capas (Controller / Service / Model)
- [ ] Conexión a base de datos MySQL
- [ ] Autenticación y autorización con JWT
- [ ] Documentación de endpoints con Swagger / OpenAPI

---

## Autor

**Santiago García**  
Desarrollador Backend  
[GitHub](https://github.com/Vulkan2345)

---

*Este proyecto se encuentra en desarrollo activo. Las funcionalidades y la estructura pueden cambiar en futuras versiones.*