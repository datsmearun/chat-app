package com.arun.chat.controller;


import com.arun.chat.model.ChatMessage;
import com.arun.chat.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @Autowired
    private ChatService chatService;

    @MessageMapping("/chat")
    @SendTo("/topic/public")
    public ChatMessage sendMessage(ChatMessage message) {
        return chatService.processMessage(message);
    }
}

