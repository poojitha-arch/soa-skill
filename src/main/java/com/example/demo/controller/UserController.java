package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
   
	@GetMapping("/home")
	public String home() {
		return "Weolcome to home";
	}
	@GetMapping("/admin")
	public String admin() {
		return "Welcome admin";
	}
	@GetMapping("/student")
	public String student() {
		return "Welcome Student";
	}
}
