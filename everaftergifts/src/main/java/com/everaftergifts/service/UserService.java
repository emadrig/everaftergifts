package com.everaftergifts.service;

import com.everaftergifts.domain.dto.UserDto;
import com.everaftergifts.domain.entity.UserEntity;

public interface UserService {

    UserEntity createUser(UserEntity userEntity);
}
