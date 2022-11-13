package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.UserEntity;

public interface UserService {

    UserDto getByUserDni(String userDni);
//      UserEntity getByUserDni(String userDni);
}
