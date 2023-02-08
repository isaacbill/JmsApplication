package com.example.JmsApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;



@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class JmsApplication {


	public static void main(String[] args) {
		SpringApplication.run(JmsApplication.class, args);
	}

}
