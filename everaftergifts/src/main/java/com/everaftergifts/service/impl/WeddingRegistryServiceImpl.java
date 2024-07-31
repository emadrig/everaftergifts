package com.everaftergifts.service.impl;

import com.everaftergifts.domain.entity.WeddingRegistryEntity;
import com.everaftergifts.repository.WeddingRegistryRepository;
import com.everaftergifts.service.WeddingRegistryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class WeddingRegistryServiceImpl implements WeddingRegistryService {
    private WeddingRegistryRepository weddingRegistryRepository;
    @Override
    public WeddingRegistryEntity createWeddingRegistry(WeddingRegistryEntity weddingRegistryEntity) {
        return weddingRegistryRepository.save(weddingRegistryEntity);
    }
}
