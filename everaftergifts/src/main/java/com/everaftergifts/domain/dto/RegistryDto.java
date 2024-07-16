package com.everaftergifts.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegistryDto {
    private long id;

    private String name;

    private String description;

    private User owner;


}
