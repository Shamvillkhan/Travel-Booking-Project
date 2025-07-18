package com.Travell.Application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Travell.Application.entity.Users;
import com.Travell.Application.service.UsersService;


@Controller
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UsersService usersService;

	@GetMapping("/get-all")
	public String get(Model model) {

		 model.addAttribute("usersList",usersService.list());
		return "users-list";
	}

	@GetMapping("/form")
	public String form(Model model, Users user) {
		System.out.println("hello");
		model.addAttribute("user", user);

		return "users-form";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute("user") Users users) {
		System.out.println("save");
		usersService.save(users);
		return "redirect:/users/get-all";
	}

}
