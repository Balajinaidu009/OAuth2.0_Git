package com.mainfolder.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DirectionController {
	@GetMapping("/normal/home")
	public String home() {
		return"It is home page and it is not secured page ";
	}
	@GetMapping("/secured/home")
	public String securedHome() {
		return "It is home page and it is secured";
	}
}
