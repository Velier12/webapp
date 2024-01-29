package ru.fiarr4ik.spring.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    
    @GetMapping("/")
	public String HomePage(Model model) {
		return "home";
	}

    @GetMapping("/auth")
	public String AuthPage (Model model) {
		return "auth";
	}

    @GetMapping("/registration")
	public String RegistrationPage (Model model) {
		return "registration";
	}

    @GetMapping("/shop")
	public String ShopPage (Model model) {
		return "shop";
	}

    @GetMapping("/")
	public String ReviewsPage (Model model) {
		return "reviews";
	}
    
}
