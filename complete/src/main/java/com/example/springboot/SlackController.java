package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlackController {

	@GetMapping("/")
	public String index() {
		return "SlackTest from Spring Boot!";
	}

}
