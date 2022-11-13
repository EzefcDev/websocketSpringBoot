package com.example.demo.controller;

import com.example.demo.entity.EntityGreeting;
import com.example.demo.entity.EntityHelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public EntityGreeting greeting(EntityHelloMessage message) throws Exception{
        Thread.sleep(1000);
        return new EntityGreeting("Hello, " + HtmlUtils.htmlEscape(message.getName()));
    }
}
