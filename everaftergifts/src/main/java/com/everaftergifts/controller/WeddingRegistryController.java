package com.everaftergifts.controller;

import com.everaftergifts.domain.dto.WeddingRegistryDto;
import com.everaftergifts.domain.entity.WeddingRegistryEntity;
import com.everaftergifts.mapper.Mapper;
import com.everaftergifts.service.WeddingRegistryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WeddingRegistryController {
    private WeddingRegistryService weddingRegistryService;
    private Mapper<WeddingRegistryEntity, WeddingRegistryDto> weddingRegistryMapper;


    @PostMapping(path="/wedding-registries")
    public WeddingRegistryDto createWeddingRegistry(@RequestBody WeddingRegistryDto weddingRegistry){
        WeddingRegistryEntity weddingRegistryEntity = weddingRegistryMapper.mapFrom(weddingRegistry);
        WeddingRegistryEntity savedWeddingRegistryEntity = weddingRegistryService.createWeddingRegistry(weddingRegistryEntity);
        return weddingRegistryMapper.mapTo(savedWeddingRegistryEntity);
    }
}
