package com.Travell.Application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Travell.Application.entity.Destination;
import com.Travell.Application.service.DestinationService;

@Controller
@RequestMapping("destination")
public class DestinationController {
	@Autowired
	private DestinationService destinationService;

	
	@GetMapping("/get-all")
	public String get(Model model) {

		model.addAttribute("destinationList", destinationService.lis());
		return "destination-list";
	}

	@GetMapping("/form")
	public String form(Model model, Destination destination) {

		model.addAttribute("destination", destination);

		return "destination-form";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute("destination") Destination destination) {

		destinationService.save(destination);
		return "redirect:/destination/get-all";
	}

}
