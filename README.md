# 🧾 Employee Payroll App (Spring Boot)

## 📌 Project Overview

The **Employee Payroll App** is a Spring Boot-based RESTful web application designed to manage employee payroll data. It replaces a mock JSON server with a fully functional backend using **Spring Boot, JPA, and MySQL**.

This application supports full **CRUD operations** and can be integrated with a frontend UI.

---

## 🚀 Features

* Create Employee Payroll Data
* Retrieve All Employees
* Retrieve Employee by ID
* Update Employee Details
* Delete Employee Record
* REST API architecture
* MySQL database integration

---

## 🛠️ Tech Stack

* **Backend:** Spring Boot
* **Database:** MySQL
* **ORM:** Spring Data JPA (Hibernate)
* **Build Tool:** Maven
* **Testing:** CURL / Postman

---

## 📁 Project Structure

```
com.bridgelabz.employeepayrollapp
│
├── controller
├── service
├── repository
├── model
├── dto
└── resources
```

---

## ⚙️ Setup Instructions

### 1️⃣ Clone Repository

```bash
git clone https://github.com/Tanmay0Bhosale/employeepayrollapp.git
cd employeepayrollapp
```

---

### 2️⃣ Configure MySQL

Create database:

```sql
CREATE DATABASE payroll_service;
```

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/payroll_service
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 3️⃣ Run Application

```bash
mvn spring-boot:run
```

Server will start at:

```
http://localhost:8080
```

---

## 📡 API Endpoints

### 🔹 Get All Employees

```
GET /employeepayrollservice/
```

### 🔹 Get Employee by ID

```
GET /employeepayrollservice/get/{id}
```

### 🔹 Create Employee

```
POST /employeepayrollservice/create
```

```json
{
  "name": "Tanmay",
  "salary": 50000
}
```

### 🔹 Update Employee

```
PUT /employeepayrollservice/update/{id}
```

### 🔹 Delete Employee

```
DELETE /employeepayrollservice/delete/{id}
```

---

## 🧪 Testing using CURL

```bash
# Get All
curl localhost:8080/employeepayrollservice/

# Get by ID
curl localhost:8080/employeepayrollservice/get/1

# Create
curl -X POST -H "Content-Type: application/json" \
-d '{"name":"Tanmay","salary":50000}' \
"http://localhost:8080/employeepayrollservice/create"

# Update
curl -X PUT -H "Content-Type: application/json" \
-d '{"name":"Updated","salary":60000}' \
"http://localhost:8080/employeepayrollservice/update/1"

# Delete
curl -X DELETE \
"http://localhost:8080/employeepayrollservice/delete/1"
```

---

## 🎯 Use Cases

### ✅ UC1: Project Setup

* Created Spring Boot project
* Configured dependencies
* Connected frontend with backend

### ✅ UC2: REST API Development

* Implemented Controller
* Established MySQL connection
* Tested APIs using CURL

---

## 🔮 Future Enhancements

* Add Validation (`@Valid`)
* Implement Exception Handling
* Add Swagger Documentation
* Integrate Frontend (React / UI)
* Add Authentication (JWT / Firebase)

---

## 👨‍💻 Author

**Tanmay Bhosale**

---

## ⭐ Notes

This project demonstrates:

* REST API development
* Layered architecture (Controller → Service → Repository)
* Database integration using JPA

---
