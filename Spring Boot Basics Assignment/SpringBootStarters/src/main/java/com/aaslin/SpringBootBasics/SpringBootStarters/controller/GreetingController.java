package com.aaslin.SpringBootBasics.SpringBootStarters.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

	@GetMapping("/greet")
	public String greet(Model model) {
		model.addAttribute("message", "Hello!");
		return "greeting";
	}
}