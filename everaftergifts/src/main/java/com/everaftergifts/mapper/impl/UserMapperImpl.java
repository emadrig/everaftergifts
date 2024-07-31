package com.everaftergifts.mapper.impl;

import com.everaftergifts.domain.dto.UserDto;
import com.everaftergifts.domain.entity.UserEntity;
import com.everaftergifts.mapper.Mapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserMapperImpl implements Mapper<UserEntity, UserDto> {
    private ModelMapper modelMapper;

    public UserDto mapTo(UserEntity userEntity){
        return modelMapper.map(userEntity, UserDto.class);
    }

    public UserEntity mapFrom(UserDto userDto){
        return modelMapper.map(userDto, UserEntity.class);
    }
}
