package com.example.demo.service;

import com.example.demo.dto.MessageDto;
import com.example.demo.entity.MessageEntity;
import com.example.demo.repository.MessageRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService{

    @Autowired
    MessageRepository messageRepository;
    @Autowired
    UserRepository userRepository;

    public String createMessage(MessageEntity message){
        messageRepository.save(message);
        return "El mensaje fue enviado";
    }

    public List<MessageDto> getAllMessageByDni(String dni){
        List<MessageEntity> messages = messageRepository.findByAllTargetUser(dni);
        List<MessageDto> messageDtos = new ArrayList<>();

        for (MessageEntity message : messages){
            MessageDto messageDto = new MessageDto();
            String userName = userRepository.findByUserDni(message.getUserDni()).getUserName();
            messageDto.setUsername(userName);
            messageDto.setMessage(message.getMessageText());
            messageDto.setIsView(message.getViewed());

            messageDtos.add(messageDto);
        }
        return messageDtos;
    }
}
