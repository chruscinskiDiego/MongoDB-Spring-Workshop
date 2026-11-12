# Spring Boot and MongoDB workshop

Java practice API for users and posts, built with Spring Boot and MongoDB persistence.

## Features

- User queries and management.
- Post queries and title search.
- Relationships between users and posts.
- Separation into resources, services, repositories, domain models and DTOs.

## Run locally

1. Install JDK 17 and Maven, as specified in pom.xml.
2. Start a local MongoDB instance and adjust the URI in src/main/resources/application.properties.
3. Run from the repository root:

```bash
sh mvnw spring-boot:run
```

## Explore the API

The main resources are /users and /posts. Refer to the resource classes under src/main/java for available methods and parameters.

## Scope

A workshop on document persistence and REST APIs. Review the database configuration before testing the application.
