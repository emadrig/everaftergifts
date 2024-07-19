package com.everaftergifts.controller;

import com.everaftergifts.domain.dto.UserDto;
import com.everaftergifts.domain.entity.UserEntity;
import com.everaftergifts.mapper.Mapper;
import com.everaftergifts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    private final Mapper<UserEntity, UserDto> userMapper;

    @Autowired
    public UserController(UserService userService,Mapper<UserEntity, UserDto> userMapper){
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @PostMapping(path="/users")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto user){
        UserEntity userEntity = userMapper.mapFrom(user);
        UserEntity savedUserEntity = userService.createUser(userEntity);
        return new ResponseEntity<>(userMapper.mapTo(savedUserEntity), HttpStatus.CREATED);
    }
}
