package com.demo.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping(value = "/show")
	String show() {
		return "hai this is from Spring boot";

	}

}
