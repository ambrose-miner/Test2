package com.springbootEmployeeRestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.bean" )
@EnableJpaRepositories(basePackages = "com.repository")
public class SpringbootEmployeeRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEmployeeRestApiApplication.class, args);
		System.out.println("Running");
	}

}
