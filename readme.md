# 🚀 API UI Automation Framework

A scalable and reusable automation framework developed using **Java, REST Assured, TestNG, Maven, and Jackson** for API testing. The framework follows an enterprise-style layered architecture with reusable components, configuration management, reporting, JSON schema validation, and automated test execution.

---

## 📌 Project Overview

This project demonstrates a production-style API automation framework that automates CRUD (Create, Read, Update, Delete) operations using REST Assured.

The framework is designed with maintainability, scalability, and reusability in mind by separating business logic, API client implementation, configuration management, test execution, and reporting.

The project includes:

- CRUD API automation
- POJO-based request and response serialization
- Configuration management
- JSON Schema Validation
- Extent HTML Reports
- Reusable API Client
- Enterprise folder structure
- TestNG integration
- Maven build support
- GitHub version control

---

# 🛠 Tech Stack

| Technology | Purpose |
|------------|----------|
| Java 17 | Programming Language |
| REST Assured | API Automation |
| TestNG | Test Execution |
| Maven | Build & Dependency Management |
| Jackson | JSON Serialization & Deserialization |
| JSON Schema Validator | Response Validation |
| Extent Reports | HTML Reporting |
| Log4j2 | Logging |
| Git & GitHub | Version Control |

---

# 📂 Project Structure

```
api-ui-automation-framework
│
├── src
│   ├── main
│   │
│   ├── java
│   │   ├── base
│   │   │      ApiBase.java
│   │   │
│   │   ├── client
│   │   │      UserApiClient.java
│   │   │
│   │   ├── constants
│   │   │      Endpoints.java
│   │   │
│   │   ├── models
│   │   │      UserRequest.java
│   │   │      UserResponse.java
│   │   │
│   │   ├── reports
│   │   │      ExtentReportManager.java
│   │   │
│   │   ├── listeners
│   │   │      ExtentTestListener.java
│   │   │
│   │   └── utils
│   │          ConfigReader.java
│   │
│   └── resources
│       ├── config.properties.example
│       ├── schemas
│       └── log4j2.xml
│
├── test
│   └── java
│       ├── api
│       │      BaseTest.java
│       │      UserManagementApiTests.java
│
├── reports
│      ExtentReport.html
│
├── testng.xml
├── pom.xml
└── README.md
```

---

# 🏗 Framework Architecture

```
                    TestNG

                       │

                UserManagementApiTests

                       │

                    BaseTest

                       │

                 UserApiClient

                       │

                    ApiBase

                       │

                REST Assured

                       │

                   ReqRes API
```

---

# ⚙ Features

- Enterprise project structure
- Reusable API client
- Base API configuration
- Configuration management using Properties file
- CRUD API automation
- POJO-based request/response models
- JSON Schema Validation
- Extent HTML Reports
- TestNG execution
- Maven support
- Externalized configuration
- GitHub ready project

---

# 🧩 Framework Components

## ApiBase

Responsible for:

- Initializing REST Assured
- Creating Request Specification
- Setting default headers
- Base URI configuration

---

## ConfigReader

Reads configuration values from:

```
config.properties
```

Supports:

- Base URL
- API Key
- Future environment variables

---

## UserApiClient

Contains reusable methods for:

- Create User
- Get User
- Update User
- Delete User

This keeps API implementation separate from test logic.

---

## BaseTest

Responsible for:

- Initializing framework
- Creating Request Specification
- Initializing API Client

Executed before every TestNG test.

---

## POJO Models

### UserRequest

Used for serializing Java objects into JSON.

### UserResponse

Used for deserializing API responses into Java objects.

Unknown properties are ignored using:

```java
@JsonIgnoreProperties(ignoreUnknown = true)
```

---

## JSON Schema Validation

Every API response is validated against predefined JSON schemas.

Example:

```java
response.then()
.body(matchesJsonSchemaInClasspath("schemas/createUserSchema.json"));
```

---

## Reporting

Extent Reports automatically generate HTML execution reports containing:

- Passed Tests
- Failed Tests
- Skipped Tests
- Execution Time
- Environment Information

---

# ✅ Test Scenarios

The framework automates the following APIs:

### Create User

- Validate Status Code
- Validate Response Body
- Validate JSON Schema
- Validate Generated ID

---

### Get User

- Validate Status Code
- Validate User Details
- Validate JSON Schema

---

### Update User

- Validate Status Code
- Validate Updated Values
- Validate Timestamp
- Validate JSON Schema

---

### Delete User

- Validate Status Code

---

# ▶ Running the Project

Clone repository

```
git clone https://github.com/SeemaKeshri/api-ui-automation-framework.git
```

Open in IntelliJ IDEA.

Install Maven dependencies.

Configure:

```
config.properties
```

Run:

```
testng.xml
```

or

```
mvn clean test
```

---

# 🔑 Configuration

Create

```
config.properties
```

Example

```properties
base.url=https://reqres.in
api.key=YOUR_API_KEY
```

---

# 📊 Reports

Execution reports are generated at:

```
reports/ExtentReport.html
```

---

# 📈 Future Enhancements

- CI/CD using GitHub Actions
- Jenkins Integration
- Docker Execution
- Allure Reports
- Parallel Execution
- Retry Mechanism
- Data Driven Testing
- Environment Profiles
- API Contract Testing
- Database Validation
- OAuth2 Authentication
- Request & Response Logging

---

# 📷 Sample Report

_Add a screenshot of your Extent Report here._

Example:

```
reports/ExtentReport.png
```

---

# 👩‍💻 Author

**Seema Keshri**

Software Development Engineer in Test (SDET)

### Skills

- Java
- Selenium
- Playwright
- REST Assured
- TestNG
- SQL
- API Testing
- Automation Framework Design
- Maven
- Git
- CI/CD

---

# ⭐ If you found this project useful, consider giving it a star.

<img width="1918" height="456" alt="image" src="https://github.com/user-attachments/assets/14502db6-0371-464d-a1ce-a6cd490c2a2a" />

<img width="1918" height="821" alt="image" src="https://github.com/user-attachments/assets/d9906709-5b9f-492b-a2f4-7a422ef0eced" />
