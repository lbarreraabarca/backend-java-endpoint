# Backend java endpoint
This microservice was development in Java 11. Also, we used SpringBoot framework.

## How to use?

```bash
mvn clean package -DskipTests
java -jar target/backend_java_endpoint-1.0.jar
```

- If you want to submit a request then you need to use the following command.

```
curl --location --request POST 'localhost:8081/controller' \
    --header 'Content-Type: application/json' \
    --data-raw '{ "some": "" }'
```