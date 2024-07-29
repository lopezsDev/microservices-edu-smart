# Microservices Edu Smart 🎓

Welcome to the **Microservices Edu Smart** repository! This project is a backend application built with Java, utilizing a microservices architecture. It includes various services for managing courses and students, along with an API Gateway, a configuration service, and Eureka for service discovery.

## Project Structure 🗂️

- **Course Service** 📘: Manages course-related operations.
- **Student Service** 🎓: Manages student-related operations.
- **API Gateway** 🌐: Central entry point for routing requests to the appropriate services.
- **Configuration Service** ⚙️: Centralized configuration management.
- **Eureka Server** 🔍: Service discovery server.

## Technology Stack 🛠️

- **Java 17** ☕
- **Spring Boot** 🌱
- **Spring Cloud** ☁️
  - **Eureka** 🔍
  - **API Gateway** 🌐
  - **Config Server** ⚙️
- **Maven** 📦
- **Docker** 🐳 (optional for containerization)

## Getting Started 🚀

Follow these instructions to set up and run the project on your local machine.

### Prerequisites

- Java 17
- Maven
- Docker (optional)

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/microservices-edu-smart.git
    cd microservices-edu-smart
    ```

2. Build the project using Maven:
    ```bash
    mvn clean install
    ```

3. Run the services:
    ```bash
    mvn spring-boot:run -pl course-service
    mvn spring-boot:run -pl student-service
    mvn spring-boot:run -pl api-gateway
    mvn spring-boot:run -pl config-service
    mvn spring-boot:run -pl eureka-server
    ```

## Contact 📬

Developer: **Samir López**

Email: [lopezs.dev@gmail.com](mailto:lopezs.dev@gmail.com)

Feel free to reach out if you have any questions or suggestions!
