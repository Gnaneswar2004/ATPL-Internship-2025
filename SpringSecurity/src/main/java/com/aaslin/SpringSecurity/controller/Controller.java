package com.aaslin.SpringSecurity.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hello")
	public String hello(@AuthenticationPrincipal UserDetails userDetails) {
		if (userDetails != null) {
			return "Hello, " + userDetails.getUsername() + "! You are authenticated.";
		}
		else {
			return "Hello, Guest! You are not authenticated.";
		}
	}
}