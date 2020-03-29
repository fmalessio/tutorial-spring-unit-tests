package com.fmalessio.unittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.fmalessio.unittest.repository" })
public class UnittestApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnittestApplication.class, args);
	}

}
