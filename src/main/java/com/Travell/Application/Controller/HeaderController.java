package com.Travell.Application.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Travell.Application.Entity.Contact;
 

@Controller
public class HeaderController {
	
	@GetMapping("/index")
	public String index(Model model) {
		
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
