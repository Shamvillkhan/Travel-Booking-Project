package com.Travell.Application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Travell.Application.entity.About;
import com.Travell.Application.service.AboutService;

@Controller
@RequestMapping("/about")
public class AboutController {
		
	private AboutService aboutService;
	public AboutController(AboutService aboutService) {
		this.aboutService=aboutService;
	}
	
	@GetMapping("/form")
	public String getAboutForm(Model model) {
		model.addAttribute("about",new About());
		return "about-form";
	}
	
	@PostMapping("/save")
	public String saveAbout(@ModelAttribute About about) {
		aboutService.saveAbout(about);
		return "redirect:/about";
	}
}
