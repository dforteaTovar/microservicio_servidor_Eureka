package com.david.micro.springboot.webflux.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//habilitamos la anotacion para el servidor de eureka
@EnableEurekaServer
@SpringBootApplication
public class SpringBootWebfluxEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebfluxEurekaApplication.class, args);
	}

}
