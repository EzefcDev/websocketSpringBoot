package com.example.demo.service;

import com.example.demo.dto.MessageDto;
import com.example.demo.entity.MessageEntity;

import java.util.List;

public interface MessageService {

    String createMessage(MessageEntity message);

    List<MessageDto> getAllMessageByDni(String dni);
}
