package com.everaftergifts.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.everaftergifts.domain.entity")
@EnableJpaRepositories(basePackages = "com.everaftergifts.repository")
public class EverAfterGiftsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EverAfterGiftsApplication.class, args);
	}

}
