# email-service Email

This is a microservice application to expose email-service email.

## Application technical stack
- Java 17
- Spring Boot
- Spring Web
- Spring Data and Hibernate
- Lombok
- Postgre SQL

### Running the application locally

*Software Requirements*
- Java 17 SDK installed
- Maven (>= 3.1.1)
- PG Admin
- Postman

*Setup dev-support*

We recommend the usage of ssh to clone any repository.

Clone the dev-support project

```
$ cd ~/workspace/email
$ git clone git@github.com:tizianaamica/email-service.git
```

*Setup the application.properties*

```
# Server Port
server.port=8091
spring.application.name=email-service

# PostgreSQL Database
spring.datasource.url=jdbc:postgresql://localhost:5432/nombre_bd
spring.datasource.username=user
spring.datasource.password=password

# Hibernate JPA
spring.jpa.hibernate.ddl-auto=none
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

# Flyway
spring.flyway.enabled=true
spring.flyway.user=user
spring.flyway.password=password
spring.flyway.locations=classpath:db/migration

```

*Author*

```
Tiziana Amicarella Girardi

# Github: @tizianaamica
```

