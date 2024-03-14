package com.example.demowebthymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoWebThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWebThymeleafApplication.class, args);

		Person person = new Person(1, "sdf", "sfhajfsd");
		System.out.println("name: " + person.getName());
	}

}
