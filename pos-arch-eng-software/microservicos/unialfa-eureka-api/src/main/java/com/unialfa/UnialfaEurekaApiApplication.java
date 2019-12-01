package com.unialfa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UnialfaEurekaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnialfaEurekaApiApplication.class, args);
	}

}
