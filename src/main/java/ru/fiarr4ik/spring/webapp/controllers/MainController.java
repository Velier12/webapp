package ru.fiarr4ik.spring.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.fiarr4ik.spring.webapp.models.ShopModel;
import ru.fiarr4ik.spring.webapp.repo.ShopModelRepository;

@Controller
public class MainController {

	@Autowired
	private ShopModelRepository shopModelRepository;
    @GetMapping("/home")
	public String HomePage(Model model) {
		return "home";
	}

    @GetMapping("/home/auth")
	public String AuthPage (Model model) {
		return "auth";
	}

    @GetMapping("/home/registration")
	public String RegistrationPage (Model model) {
		return "registration";
	}

    @GetMapping("/home/shop")
	public String ShopPage (Model model) {
		return "shop";
	}

    @GetMapping("/home/reviews")
	public String ReviewsPage (Model model) {
		return "reviews";
	}
    
}
