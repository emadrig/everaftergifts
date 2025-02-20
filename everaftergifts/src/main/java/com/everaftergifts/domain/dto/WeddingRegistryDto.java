package com.everaftergifts.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WeddingRegistryDto {
    private Long id;
    private String name;
    private UserDto owner;
    private Date eventDate;
}
