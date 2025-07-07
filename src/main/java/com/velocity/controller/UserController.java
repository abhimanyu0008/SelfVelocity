package com.velocity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping
	public String demo() {
		return "index";
	}
	@GetMapping("/cars")
	public String demo1() {
		return "cars";
	}
}
