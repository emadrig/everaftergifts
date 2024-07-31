package com.everaftergifts.repository;

import com.everaftergifts.domain.entity.WeddingRegistryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeddingRegistryRepository extends JpaRepository<WeddingRegistryEntity, Long> {
}
