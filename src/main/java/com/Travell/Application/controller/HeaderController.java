package com.Travell.Application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.Travell.Application.entity.Contact;
import com.Travell.Application.service.AboutService;
import com.Travell.Application.service.BlogService;
import com.Travell.Application.service.GalleryService;
import com.Travell.Application.service.ServiceService;
 

@Controller
public class HeaderController {
	
	private BlogService blogService;
	private GalleryService galleryService;
	private ServiceService serviceService;	
	private AboutService aboutService;
	public HeaderController(BlogService blogService,AboutService aboutService,ServiceService serviceService,GalleryService galleryService) {
		this.aboutService=aboutService;
		this.serviceService=serviceService;
		this.galleryService=galleryService;
		this.blogService=blogService;
	}
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("contact",new Contact());
		model.addAttribute("abouts",aboutService.getAbout());
		model.addAttribute("service1",serviceService.getService(1).get());
		model.addAttribute("service2",serviceService.getService(2).get());
		model.addAttribute("service3",serviceService.getService(3).get());
		model.addAttribute("service4",serviceService.getService(4).get());
		model.addAttribute("galleryList",galleryService.getAllGalleryImages());
		System.out.println("index calling >>>>>>>>>>>>>><<<<<<<<<<<<<");
		return "index";
	}
	
	@GetMapping("/about")
	public String about(Model model) {
		System.out.println(aboutService.getAbout());
		model.addAttribute("abouts",aboutService.getAbout());
		return "about";
	}
	
	@GetMapping("/packages")
	public String packages() {
		return "packages";
	}
	
	@GetMapping("/service")
	public String services(Model model) {
		
		model.addAttribute("service1",serviceService.getService(1).get());
		model.addAttribute("service2",serviceService.getService(2).get());
		model.addAttribute("service3",serviceService.getService(3).get());
		model.addAttribute("service4",serviceService.getService(4).get());
		return "service";
	}
	
	@GetMapping("/gallery")
	public String gallery(Model model) {
		System.out.println(galleryService.getAllGalleryImages());
		model.addAttribute("galleryList",galleryService.getAllGalleryImages());
		return "gallery";
	}
	
	@GetMapping("/blog")
	public String blog(Model model) {
		model.addAttribute("blogs",blogService.getAllBlogs());
		return "blogs";
	}
	@GetMapping("/contact")
	public String contact(Model model) {
		model.addAttribute("contact",new Contact());
		return "contact";
	}
	
}
