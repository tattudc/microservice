package com.tarcisio.helloSpring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class helloController {
	@GetMapping("/hello-world")
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Hello World!");
		
	}
}