package com.example.demo.controller;

import com.example.demo.dto.MessageDto;
import com.example.demo.entity.MessageEntity;
import com.example.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class MessageController {

    @Autowired
    MessageService messageService;

    @PostMapping("/message")
    public String sendMessage(@RequestBody MessageEntity message){
        return messageService.createMessage(message);
    }

    @GetMapping("/message/{dni}")
    public List<MessageDto> getAllMessage(@PathVariable (name = "dni") String dni){
        return messageService.getAllMessageByDni(dni);
    }
}
