package com.demo.basicspringwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EnableAutoConfiguration
@SpringBootApplication
public class BasicSpringWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicSpringWebappApplication.class, args);
	}

}
