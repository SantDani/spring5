package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.User;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@GetMapping({ "/index", "/", "/home"})
	public String index(Model model) {
		/**
		 * There are alternatives to Model like Map, ModelAndView
		 */
		model.addAttribute("titleDocument", "title Document");
		model.addAttribute("title", "Hello Spring Framework by code");
		return "index";	
	}
	
	@RequestMapping("/profile")
	public String profile(Model model) {
		
		User user = new User();
		user.setName("Luffy");
		user.setLastName("Monky D.");
		
		model.addAttribute(user);
		model.addAttribute("titleDocument", "User");
		model.addAttribute("title", "Hello ".concat(user.getName()).concat("!"));
		
		return "profile";
	}

}
