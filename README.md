# Kafka Consumer Service

Kafka Consumer Service es una aplicación desarrollada con Spring Boot que permite consumir mensajes de múltiples tópicos de Kafka. Está diseñada para ser flexible y configurable, lo que la hace ideal para entornos locales y de producción.

## Descripción

La aplicación está diseñada para ejecutarse en un entorno local o en un servidor y se encarga de escuchar mensajes de múltiples tópicos de Kafka para procesarlos. Los tópicos pueden configurarse dinámicamente mediante propiedades o parámetros al momento de ejecutar la aplicación.

## Características

- Configuración de consumidor Kafka utilizando `spring-kafka`, con soporte para múltiples tópicos.
- Escucha de mensajes en múltiples tópicos mediante la anotación `@KafkaListener`, con opciones de configuración dinámica.
- Registro de mensajes consumidos en los logs utilizando SLF4J.
- Construcción y empaquetado con Maven para facilitar la integración y despliegue.
- Compatible con Java 21, aprovechando las últimas características del lenguaje.

## Requisitos

- **Java 21**: Asegúrate de tener instalado JDK 21.
- **Apache Kafka**: Kafka debe estar configurado y ejecutándose.
- **Maven**: Para construir y ejecutar el proyecto.

## Construcción del Proyecto

Antes de ejecutar la aplicación, es necesario construir el proyecto utilizando Maven. Este proceso también descargará las dependencias necesarias. Ejecuta el siguiente comando:

```bash
mvnw clean install
```

## Ejecución local

La aplicación está diseñada para ejecutarse en un entorno local o en un servidor. Una vez iniciada, estará escuchando mensajes de múltiples tópicos de Kafka configurados en el proyecto. Por defecto, la aplicación se ejecutará en [http://localhost:8082](http://localhost:8082). Los mensajes consumidos de Kafka se registrarán en el log utilizando SLF4J, incluyendo el nombre del tópico de origen.

Puedes especificar los tópicos que el listener debe escuchar pasando los nombres, separados por comas, como parámetros al ejecutar la aplicación. Por ejemplo:

```bash
./mvnw spring-boot:run -Dspring-boot.run.arguments="--kafka.topics=demo-topic,another-topic"
```
En este caso, el listener estará escuchando mensajes de los tópicos `demo-topic` y `another-topic`.

Si no se especifican tópicos mediante parámetros, la aplicación utilizará los valores predeterminados configurados en el archivo application.properties. Asegúrate de definir los tópicos predeterminados en este archivo, como en el siguiente ejemplo:
```plaintext
kafka.topics=default-topic1,default-topic2
```
## 🐳 Ejecución con Docker

Este proyecto incluye un archivo `docker-compose.dev.yaml` para facilitar la ejecución en entornos locales de desarrollo.

### 🔧 Comandos principales

Para construir y levantar la aplicación en modo desarrollo:

```bash
docker compose -f docker-compose.dev.yaml up -d
```

Para detener la aplicación sin eliminar los contenedores:

```bash
docker compose -f docker-compose.dev.yaml stop
```

### 🔧 Configuración de docker-compose.dev.yaml
El archivo `docker-compose.dev.yaml` incluye la configuración necesaria para conectar con un broker Kafka. Asegúrate de que el broker esté disponible en la red `kafka-network`. Por ejemplo:

```yaml
services:
  kafkaconsumerservice:
    environment:
      SPRING_KAFKA_BOOTSTRAPSERVERS: kafka-broker:9092
    networks:
      - kafka-network
networks:
  kafka-network:
    external: true
```

### 📘 Comandos adicionales de Docker

Este proyecto sigue una estructura estandarizada para el uso de Docker en todos los servicios.  
Puedes consultar la guía completa de comandos Docker en el siguiente enlace:

👉 [Ver README.docker.md en kafka-infra](https://github.com/Miguel-Alejandro-Castillo/kafka-infra/blob/master/README.Docker.md)

Este archivo centralizado se mantiene actualizado y es compartido entre todos los proyectos para asegurar consistencia y buenas prácticas.

## Licencia
Este proyecto está bajo la licencia [MIT](LICENSE)

---

Gracias por utilizar Kafka Consumer Service. Si tienes alguna pregunta o sugerencia, no dudes en compartirla. 😊
