# Workshop Spring Boot e MongoDB

API de estudo em Java para trabalhar com usuários e publicações, utilizando Spring Boot e persistência em MongoDB.

## Recursos

- Consulta e manutenção de usuários.
- Consulta de publicações e busca por título.
- Relação entre usuários e suas publicações.
- Organização em resources, services, repositories, domínio e DTOs.

## Executar localmente

1. Instale JDK 17 e Maven, conforme pom.xml.
2. Disponibilize um MongoDB local e ajuste a URI em src/main/resources/application.properties.
3. Na raiz, execute:

```bash
sh mvnw spring-boot:run
```

## Explorar a API

Os recursos principais são /users e /posts. Consulte os resources em src/main/java para os métodos e parâmetros disponíveis.

## Escopo

Workshop de persistência orientada a documentos e APIs REST. A inicialização e os endpoints não foram executados nesta revisão; revise a configuração do banco antes de testar.
