package com.example.MtaAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.MtaAPI"})
public class DemoApiApplication{

	public static void main(String[] args) {
		SpringApplication.run(DemoApiApplication.class, args);
	}

}
