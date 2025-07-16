package com.Travell.Application.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Travell.Application.Entity.Contact;
import com.Travell.Application.Service.ContactService;

@Controller
@RequestMapping("/contacts")
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	public ContactController(ContactService contactService) {
		this.contactService=contactService;
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute Contact contact) {
		contactService.saveContact(contact);
		return "redirect:/index";
	}
}
