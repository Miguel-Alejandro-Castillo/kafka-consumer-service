package com.kafka.consumer.listerners;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerListener {

    private Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerListener.class);

    @KafkaListener(topics = "#{'${kafka.topics}'.split(',')}", groupId = "mi-group-id")
    public void listener(ConsumerRecord<String, String> record) {
        String topic = record.topic();
        String message = record.value();
        LOGGER.info("Mensaje recibido del tópico '{}': {}", topic, message);
    }
}
