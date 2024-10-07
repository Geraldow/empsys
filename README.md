# Employee System

This project aims to develop a scalable and highly maintainable platform, using a microservices architecture based on hexagonal architecture principles. 
Each microservice will encapsulate business-specific functionality, enabling greater agility in independent development, deployment, and scaling.

![un sistema de empleados con Spring Boot](https://github.com/user-attachments/assets/8ae6bdb7-161d-4688-95ef-e8ffede25f0a)

## Table of Contents
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [File Structure](#file-structure)


## Prerequisites
- Java JDK
  - Install JDK 11 or higher. Discharge.
- Maven
  - Install Maven to manage dependencies. Installation guide.
- IDE
  -  Intellij IDEA (recommended)
  -  Eclipse
  -  NetBeans
  -  Spring Tool Suite (STS) 
- Database
  - Configure a database (MySQL, PostgreSQL) and update application.properties.
- Run the following command in the root of the project:
  - `mvn clean install`

## Installation
### To download the Employer System source code, follow these steps:
```sh
# Clone the repository
git clone https://github.com/Geraldow/empsys.git

# Install dependencies
mvn clean install

# Run the application with the following command:
mvn spring-boot:run

# In the browser navigate to:
http://localhost:8080/empsys
```

## Project Structure
```sh
empsys
├── .idea
├── .mvn
├── application
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── net.empsys
│   │   │   │       ├── employees
│   │   │   │       │   ├── controller	
│   │   │   │       │   └── usecases
│   │   │   │       └── vacancies
│   │   │   │           ├── controller	
│   │   │   │           └── usecases
│   │   │   ├── resources
│   │   │   │   ├── static
│   │   │   │       ├── css
│   │   │   │       └── images
│   │   │   │   └── templates
│   │   │   └── application.properties
│   │   └── test
│   └── pom.xml
├── bootloader
│   ├── src
│   │   ├── main
│   │   │   └── java
│   │   │       └── net.empsys
│   │   │           └── EmpsysApplication
│   │   └── test
│   └── pom.xml
├── domain
│   ├── src
│   │   ├── main
│   │   │   └── java
│   │   │   │   └── net.empsys
│   │   │   │       ├── employees
│   │   │   │       │   ├── contract
│   │   │   │       │   ├── model
│   │   │   │       │   └── service
│   │   │   │       └── vacancies
│   │   │   │           ├── contract
│   │   │   │           ├── model
│   │   │   │           └── service
│   │   │   └── resources
│   │   └── test
│   └── pom.xml
├── infraestructure
│   ├── src
│   │   ├── main
│   │   │   └── java
│   │   │   │   └── net.empsys
│   │   │   │       ├── config
│   │   │   │       ├── employees
│   │   │   │       │   ├── cmd
│   │   │   │       │   └── repository
│   │   │   │       └── messaging
│   │   │   └── resources
│   │   └── test
│   └── pom.xml
└── pom.xml
```

## Technologies used
Languages: 
  - Thymeleaf
  - CSS
  - Spring Boot
  - SQL
