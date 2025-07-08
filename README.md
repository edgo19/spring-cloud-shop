# Spring Cloud Shop Example

This project demonstrates a simple microservices architecture using Spring Boot and Spring Cloud. It contains three services:

- **product-service**: Manages products
- **order-service**: Manages orders
- **customer-service**: Manages customers

Each service is a standalone Spring Boot application with a REST controller and is ready for Eureka service discovery integration.

## How to Run

1. Build each service with Maven:
   - `cd product-service && mvn clean package`
   - `cd order-service && mvn clean package`
   - `cd customer-service && mvn clean package`
2. Run each service:
   - `cd product-service && mvn spring-boot:run`
   - `cd order-service && mvn spring-boot:run`
   - `cd customer-service && mvn spring-boot:run`

## Endpoints
- Product Service: `GET http://localhost:8081/products`
- Order Service: `GET http://localhost:8082/orders`
- Customer Service: `GET http://localhost:8083/customers`
