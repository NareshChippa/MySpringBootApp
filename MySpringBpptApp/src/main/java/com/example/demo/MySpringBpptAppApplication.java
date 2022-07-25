package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBpptAppApplication {
	private static Logger logger = LoggerFactory.getLogger(MySpringBpptAppApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application init started....");
	}

	public static void main(String[] args) {
		logger.info("Application main method started");
		SpringApplication.run(MySpringBpptAppApplication.class, args);
		System.out.println("Hi I am here");
		System.out.println("Added one more print statement");
		logger.info("Application main method finished");
	}

}

