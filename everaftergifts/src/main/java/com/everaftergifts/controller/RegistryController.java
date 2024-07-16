package com.everaftergifts.controller;

import com.everaftergifts.domain.entity.Registry;
import com.everaftergifts.service.RegistryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistryController {

    private RegistryService registryService;

    public RegistryController(RegistryService registryService) {
        this.registryService = registryService;
    }

    @PostMapping(path="/registries")
    public Registry createRegistry(@RequestBody Registry registry) {
        return registryService.createRegistry(registry);
    }
}
