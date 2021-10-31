package com.matSida.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@GetMapping("/matsvinn")
	public String hello(@RequestParam(value = "amount", defaultValue = "1000") String amount) {
		return String.format("Matsvinn = " + Integer.parseInt(amount)*0.2);
	}

}
