package com.everaftergifts.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.everaftergifts.domain.entity")
public class EverAfterGiftsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EverAfterGiftsApplication.class, args);
	}

}
