package com.dojo.CustomerServive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CustomerServiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiveApplication.class, args);
	}

}
