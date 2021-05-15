package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Thread Safe Number Increment Application.
 *
 * @author Anant Jain
 *
 */
@SpringBootApplication
@EnableAsync
public class IncrementTestApplication {
	
    /**
     * Launches the application
     * 
     * @param args - Application startup arguments
     */
	public static void main(String[] args) {
		SpringApplication.run(IncrementTestApplication.class, args);
		System.out.println("Server Started");
	}

}
