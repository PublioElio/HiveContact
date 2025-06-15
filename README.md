
# 🐝 HiveContact

> Microservicio RESTful para la gestión de contactos, desarrollado con **Spring Boot 3**, **MySQL** y **JPA**.  

## Descripción

**HiveContact** es una API REST que permite realizar operaciones CRUD (crear, leer, actualizar y eliminar) sobre una base de datos de contactos. El sistema está diseñado utilizando buenas prácticas de arquitectura de software, incluyendo separación por capas (`controller`, `service`, `dao`, `model`) y pruebas automatizadas con `MockMvc`.

El nombre “Hive” hace alusión a una colmena: _organizada, eficiente y escalable_.

---

## 📂 Estructura del Proyecto

```bash
HiveContact/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── home/             # Clase principal de arranque
│   │   │   ├── controllers/      # Endpoints REST
│   │   │   ├── dao/              # Interfaces y repositorios JPA
│   │   │   ├── model/            # Entidades JPA
│   │   │   ├── service/          # Lógica de negocio
│   │   ├── resources/
│   │   │   ├── application.properties  # Configuración general
│   ├── test/
│   │   ├── java/home/           # Pruebas de integración con MockMvc
│── pom.xml                      # Configuración de Maven
│── README.md                    # Este archivo
```

---

## ⚙️ Tecnologías Utilizadas

- **Java 21**
- **Spring Boot 3.5.0**
- **Spring Data JPA**
- **MySQL 8+**
- **Maven**
- **JUnit 5 + MockMvc**

---

## 🧩 Arquitectura

HiveContact sigue una arquitectura multicapa:

```
Controller → Service → DAO (→ JPA Repository) → MySQL
```

- **Controller:** Expone los endpoints `/contacts` usando `@RestController`.
- **Service:** Aplica la lógica de negocio (verificación previa a inserciones, validaciones...).
- **DAO:** Interfaz e implementación para acceso a la base de datos.
- **Model:** Clase `Contact`, mapeada a una tabla SQL mediante JPA.
- **Base de datos:** Tabla `contacts` con `id`, `nombre`, `email` y `edad`.

---

## 📝 Endpoints REST

Todos los endpoints están bajo `/contacts` y consumen/producen JSON.

| Método | Endpoint         | Descripción                  | Códigos de respuesta |
|--------|------------------|------------------------------|----------------------|
| GET    | `/contacts`      | Devuelve todos los contactos | `200 OK`             |
| GET    | `/contacts/{id}` | Devuelve un contacto por ID  | `200 OK`, `404`      |
| POST   | `/contacts`      | Crea un nuevo contacto       | `201 Created`, `400` |
| PUT    | `/contacts`      | Actualiza un contacto        | `200 OK`, `404`      |
| DELETE | `/contacts/{id}` | Elimina un contacto por ID   | `200 OK`, `404`      |

---

## 🧪 Testing

Las pruebas están desarrolladas con **JUnit 5** y **MockMvc**, cubriendo:

- Creación de contacto (`POST`)
- Listado (`GET`)
- Actualización (`PUT`)
- Eliminación y verificación (`DELETE` + `GET`)

Ejecuta los tests con:

```bash
mvn test
```

---

## 🛠️ Configuración (application.properties)

```properties
spring.application.name=HiveContact
spring.datasource.url=jdbc:mysql://localhost:3306/hivecontacts?serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.naming.implicit-strategy=org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyJpaImpl
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
```

---

## Base de Datos (Script SQL)

```sql
CREATE DATABASE IF NOT EXISTS hivecontacts;
USE hivecontacts;

CREATE TABLE contacts (
    id_contact INT AUTO_INCREMENT PRIMARY KEY,
    contact_name VARCHAR(255) NOT NULL,
    contact_email VARCHAR(255) UNIQUE NOT NULL,
    contact_age INT NOT NULL
);
```

Y se incluye un script con más de 50 contactos predefinidos para pruebas y validaciones.

---

## ▶️ Ejecución del Proyecto

```bash
mvn spring-boot:run
```

O bien, generar el `.jar`:

```bash
mvn clean package
java -jar target/HiveContact-0.0.1-SNAPSHOT.jar
```
