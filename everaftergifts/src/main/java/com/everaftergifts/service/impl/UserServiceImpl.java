package com.everaftergifts.service.impl;

import com.everaftergifts.domain.dto.UserDto;
import com.everaftergifts.domain.entity.UserEntity;
import com.everaftergifts.repository.UserRepository;
import com.everaftergifts.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }
}
