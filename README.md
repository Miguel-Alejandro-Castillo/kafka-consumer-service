# Kafka Consumer Service

Este proyecto es un servicio desarrollado con Spring Boot para consumir mensajes de un tópico Kafka.

## Descripción

La aplicación está diseñada para ejecutarse en un entorno local o en un servidor y se encarga de escuchar mensajes de un tópico Kafka específico para procesarlos.

## Características

- Configuración de consumidor Kafka utilizando `spring-kafka`.
- Escucha de mensajes en un tópico específico mediante la anotación `@KafkaListener`.
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
La aplicación está diseñada para ejecutarse en un entorno local o en un servidor. Una vez iniciada, estará escuchando mensajes de un tópico Kafka configurado en el proyecto.
Por defecto, la aplicación se ejecutará en [http://localhost:8082](http://localhost:8082). Los mensajes consumidos de Kafka se registrarán en el log utilizando SLF4J.
Para ejecutar la aplicación, utiliza el siguiente comando:

```bash
mvn spring-boot:run
```

## Licencia
Este proyecto está bajo la licencia [MIT](LICENSE)

---

Gracias por utilizar Kafka Consumer Service. Si tienes alguna pregunta o sugerencia, no dudes en compartirla. 😊
