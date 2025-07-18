package com.Travell.Application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.Travell.Application.entity.Servicee;
import com.Travell.Application.service.ServiceService;

@Controller
@RequestMapping("/services")
public class ServiceController {
	
	private ServiceService serService;
	
	public ServiceController (ServiceService serService) {
		this.serService=serService;
	}
	
	@GetMapping("/form")
	public String getServiceForm(Model model) {
		model.addAttribute("service",new Servicee());
		return "service-form";
	}
	
	@PostMapping("/save")
	public String saveService(@ModelAttribute Servicee service) {
		serService.saveService(service);
		return "redirect:/service";
	}
}
