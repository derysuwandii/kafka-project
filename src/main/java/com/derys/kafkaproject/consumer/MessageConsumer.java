package com.derys.kafkaproject.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
    @KafkaListener(topics = "new-topic", groupId = "my-group-id")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }

}