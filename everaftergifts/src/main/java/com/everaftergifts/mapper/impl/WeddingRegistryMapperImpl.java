package com.everaftergifts.mapper.impl;

import com.everaftergifts.domain.dto.WeddingRegistryDto;
import com.everaftergifts.domain.entity.WeddingRegistryEntity;
import com.everaftergifts.mapper.Mapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class WeddingRegistryMapperImpl implements Mapper<WeddingRegistryEntity, WeddingRegistryDto> {

    private ModelMapper modelMapper;
    public WeddingRegistryDto mapTo(WeddingRegistryEntity weddingRegistryEntity){
        return modelMapper.map(weddingRegistryEntity, WeddingRegistryDto.class);
    }

    public WeddingRegistryEntity mapFrom(WeddingRegistryDto weddingRegistryDto){
        return modelMapper.map(weddingRegistryDto, WeddingRegistryEntity.class);

    }
}
