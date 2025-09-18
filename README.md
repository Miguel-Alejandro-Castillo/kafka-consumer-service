# Kafka Consumer Service

Este proyecto es un servicio desarrollado con Spring Boot para consumir mensajes de múltiples tópicos de Kafka.

## Descripción

La aplicación está diseñada para ejecutarse en un entorno local o en un servidor y se encarga de escuchar mensajes de múltiples tópicos de Kafka para procesarlos. Los tópicos pueden configurarse dinámicamente mediante propiedades o parámetros al momento de ejecutar la aplicación.

## Características

- Configuración de consumidor Kafka utilizando `spring-kafka`.
- Escucha de mensajes en múltiples tópicos mediante la anotación `@KafkaListener`.
- Construcción y empaquetado con Maven.
- Compatible con Java 21.

## Requisitos

- **Java 21**: Asegúrate de tener instalado JDK 21.
- **Apache Kafka**: Kafka debe estar configurado y ejecutándose.
- **Maven**: Para construir y ejecutar el proyecto.

## Construcción del Proyecto

Antes de ejecutar la aplicación, es necesario construir el proyecto utilizando Maven. Ejecuta el siguiente comando:

```bash
mvn clean install
```

## Ejecución

La aplicación está diseñada para ejecutarse en un entorno local o en un servidor. Una vez iniciada, estará escuchando mensajes de múltiples tópicos de Kafka configurados en el proyecto. Por defecto, la aplicación se ejecutará en [http://localhost:8082](http://localhost:8082). Los mensajes consumidos de Kafka se registrarán en el log utilizando SLF4J, incluyendo el nombre del tópico de origen.

Puedes especificar los tópicos que el listener debe escuchar pasando los nombres, separados por comas, como parámetros al ejecutar la aplicación. Por ejemplo:

```bash
mvn spring-boot:run -Dspring-boot.run.arguments="--kafka.topics=demo-topic,another-topic,third-topic"
```
En este caso, el listener estará escuchando mensajes de los tópicos `demo-topic`, `another-topic` y `third-topic`.

Si no se especifican tópicos mediante parámetros, la aplicación utilizará los valores predeterminados configurados en el archivo application.properties.
## Licencia
Este proyecto está bajo la licencia [MIT](LICENSE)

---

Gracias por utilizar Kafka Consumer Service. Si tienes alguna pregunta o sugerencia, no dudes en compartirla. 😊
