package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello World! provider 2";
	}
	
	@GetMapping("/name")
	public String name() {
		return "provider 2";
	}

}