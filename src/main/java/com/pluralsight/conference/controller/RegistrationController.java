package com.pluralsight.conference.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {

	@GetMapping("registration")
	public String getRegPage(Map<String, Object> model) {
		
		return "registration";
	}
}
