package com.example.MtaAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com"})
public class DemoApiApplication{

	public static void main(String[] args) {
		SpringApplication.run(DemoApiApplication.class, args);
	}

}
