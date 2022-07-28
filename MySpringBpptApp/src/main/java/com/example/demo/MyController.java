package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/home")
	public String  home() {
		System.out.println("Inside controleer");
		return "home.jsp";
	}

}
