package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {
	
	public static String status;
	
	@GetMapping("/open")
	public ResponseEntity<String> open() {
		status = "open";
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}
	
	@GetMapping("/close")
	public ResponseEntity<String> close() {
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}
	
	@GetMapping("/halfopen")
	public ResponseEntity<String> halfopen() {
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}

}
