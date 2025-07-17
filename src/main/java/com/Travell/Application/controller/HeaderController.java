package com.Travell.Application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.Travell.Application.entity.Contact;
 

@Controller
public class HeaderController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("contact",new Contact());
		System.out.println("index calling >>>>>>>>>>>>>><<<<<<<<<<<<<");
		return "index";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	@GetMapping("/packages")
	public String packages() {
		return "packages";
	}
	
	@GetMapping("/service")
	public String services() {
		return "service";
	}
	
	@GetMapping("/gallery")
	public String gallery() {
		return "gallery";
	}
	
	@GetMapping("/blog")
	public String blog() {
		return "blogs";
	}
	@GetMapping("/contact")
	public String contact(Model model) {
		model.addAttribute("contact",new Contact());
		return "contact";
	}
	
}
