package com.astrazeneca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientInfoApplication.class, args);
		System.out.println("Hello");
	}

}
