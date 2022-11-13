package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    public UserDto getByUserDni(String userDni){
       Optional<UserEntity> user = Optional.ofNullable(userRepository.findByUserDni(userDni));
        UserDto userName = new UserDto();
        if(user.isPresent()){
            userName.setUserName(user.get().getUserName());
            userName.setErrorMessage("");
            return userName;
        }else{
            userName.setErrorMessage("Error");
            userName.setUserName("");
            return userName;
        }
    }

//    public UserEntity getByUserDni(String userDni){
//        Optional<UserEntity> user = Optional.ofNullable(userRepository.findByUserDni(userDni));
//        System.out.println(user);
//        return user.orElseThrow(()-> new RuntimeException("Usuario no exite"));
//    }
}
