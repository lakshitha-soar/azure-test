package com.example.demonew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemonewApplication {

	@GetMapping("/message")
	public String message() {
		return "Successfully done - buddy !!!!";
	}

	@GetMapping("/messageTwo")
	public String messageNew() {
		return "Successfully done again - buddy !!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemonewApplication.class, args);
	}

}
