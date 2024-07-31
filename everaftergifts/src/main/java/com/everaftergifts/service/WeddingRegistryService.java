package com.everaftergifts.service;

import com.everaftergifts.domain.entity.WeddingRegistryEntity;
import org.springframework.stereotype.Service;

@Service
public interface WeddingRegistryService {
    WeddingRegistryEntity createWeddingRegistry(WeddingRegistryEntity weddingRegistryEntity);
}
