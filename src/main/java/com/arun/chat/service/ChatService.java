package com.arun.chat.service;

import com.arun.chat.model.ChatMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    public ChatMessage processMessage(ChatMessage message) {
        // Add business logic or processing as needed
        messagingTemplate.convertAndSend("/topic/public", message);
        return message;
    }
}

