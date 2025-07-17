# 🛍️ eCommerce Spring Boot API

## 📚 Descripción

Este proyecto es una API RESTful desarrollada en **Java con Spring Boot** como parte del trabajo práctico final de la materia **Programación Avanzada 2**. Implementa la lógica backend de un sistema de comercio electrónico, permitiendo:

- Gestión de usuarios y autenticación mediante **JWT**.
- Administración de productos, categorías y carritos de compra.
- Registro y consulta de pedidos.
- Validaciones con **Jakarta Validation**.
- Persistencia de datos en una base de datos **PostgreSQL**.

Está diseñado bajo el patrón arquitectónico **MVC**, y su despliegue está automatizado con **Docker y Docker Compose**. La documentación está disponible mediante **Swagger UI**.

---

## 👩‍💻 Autora

**Daiana Sienra**  
Estudiante de Ingeniería en Informática  
Universidad Nacional — Programación Avanzada 2  
GitHub: [@DaiSienra129](https://github.com/DaiSienra129)

---

## 🛠️ Tecnologías Utilizadas

- Java 17 (Spring Boot)  
- PostgreSQL  
- Hibernate ORM  
- JWT (JSON Web Tokens)  
- Jakarta Validation  
- Maven  
- Docker & Docker Compose  
- Swagger (documentación de la API)

---

## ⚙️ Arquitectura del Sistema

El sistema sigue el patrón **Modelo-Vista-Controlador (MVC)**:

- **Modelo**: Entidades de dominio persistidas con Hibernate.
- **Controlador**: Endpoints REST para usuarios, productos, pedidos, etc.
- **Servicio**: Lógica de negocio separada en clases de servicio.
- **Validación**: A través de anotaciones con Jakarta Validation.

---

## 🚀 Cómo Ejecutar el Proyecto

### Opción 1: Uso del script con Docker

1. Clonar el repositorio:  
```bash
git clone https://github.com/DaiSienra129/ecommerce_api_daiana.git
cd ecommerce_api_daiana

```  

2- Hacer ejecutable el script::  
```sh
chmod +x setup.sh
```  

3- Ejecutar:  
```sh
./setup.sh
```  

This script will:  
👉 **Check and install** Maven, Docker, and Docker Compose if they are missing.  
👉 **Build the Spring Boot application** using Maven.  
👉 **Create and start** the Docker containers using `docker-compose up --build`.  

Once completed, the API will be running inside Docker containers. 🎉  

---

## 🛠 Instalación Manual 

### 📌 Requisitos:  

- **Java 17** ☕  
- **Maven** 🛠  
- **PostgreSQL** 🐘

### 🔧 Pasos  

1️⃣ **Crear la base de datos:**  
```sh
psql -U postgres
CREATE DATABASE ecommerce;
\q

```  

2️⃣ **Configurar application.properties:**  
```sh
spring.datasource.url=jdbc:postgresql://localhost:5432/ecommerce
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña

```  

3️⃣ **Compilar y ejecutar:**  
```sh
mvn clean install
mvn spring-boot:run

```  

---

## 🚀 Documentación de la API  

Una vez ejecutado, podés acceder a la documentación interactiva en:

📍 `http://localhost:8080/swagger-ui.html`

Desde allí podés probar todos los endpoints de forma visual.

---

---
