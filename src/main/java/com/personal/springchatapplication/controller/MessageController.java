package com.personal.springchatapplication.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;

import com.personal.springchatapplication.model.Message;

public class MessageController {
		
	@MessageMapping("/message")
	@SendTo("/topic/forward")
	public Message getMessage( @RequestBody Message message) {
		
		return message; 
	}
	
}
