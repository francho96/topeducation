package com.TopEducation.TopEducation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TopEducationApplication {
	public static void main(String[] args) {
		SpringApplication.run(TopEducationApplication.class, args);
		String runningStatement = "server online";
		System.out.println(runningStatement);
	}
}
