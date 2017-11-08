package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceProviderUserV1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProviderUserV1Application.class, args);
	}
}
