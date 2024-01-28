package com.arun.chat.service;

import com.arun.chat.model.ChatMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    @Autowired
    private KafkaTemplate<String, ChatMessage> kafkaTemplate;

    public void sendMessage(ChatMessage message) {
        // Add Kafka producer logic
    }
}
