package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/login/{userDni}")
    public UserDto loginUser(@PathVariable(name = "userDni") String userDni){
        return userService.getByUserDni(userDni);
    }

//    @GetMapping("/login/{userDni}")
//    public UserEntity loginUser(@PathVariable(name = "userDni") String userDni){
//        return userService.getByUserDni(userDni);
//    }
}
