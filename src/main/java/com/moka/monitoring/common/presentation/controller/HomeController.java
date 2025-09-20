package com.moka.monitoring.common.presentation.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

	@GetMapping("/")
	public String home() {
		return "Hello, Monitoring!";
	}

}
