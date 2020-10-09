package com.availability.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.availability.demo")
@EnableDiscoveryClient
public class AvailabilityApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvailabilityApplication.class, args);
	}

}
