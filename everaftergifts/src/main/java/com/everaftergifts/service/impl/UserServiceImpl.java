package com.everaftergifts.service.impl;

import com.everaftergifts.domain.entity.User;
import com.everaftergifts.repository.UserRepository;
import com.everaftergifts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
