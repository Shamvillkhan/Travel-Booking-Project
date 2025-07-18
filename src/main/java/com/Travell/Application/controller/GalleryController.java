package com.Travell.Application.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.Travell.Application.entity.Gallery;
import com.Travell.Application.repository.GalleryRepository;
import com.Travell.Application.service.GalleryService;

@Controller
@RequestMapping("/gallery")
public class GalleryController {
	
	private GalleryService galleryService;
	private GalleryRepository galleryRepo;
	
	public GalleryController(GalleryService galleryService,GalleryRepository galleryRepo) {
		this.galleryService=galleryService;
		this.galleryRepo=galleryRepo;
	}
	

	@GetMapping("/form")
	public String getForm(Model model) {
		model.addAttribute("gallery",new Gallery());
		return "gallery-form";
		
	}
	
	@PostMapping("/save")
	public String saveGallery(@RequestParam("file") MultipartFile file, @ModelAttribute Gallery gallery) throws IOException {
	    galleryService.saveGallery(file,gallery);
	    return "redirect:/gallery";
	}

	@GetMapping("/view/{id}")
	public String viewGalleryItem(@PathVariable Long id, Model model) {
	     
	    model.addAttribute("item", galleryRepo.getById(id));
	    return "gallery-detail"; // name of your Thymeleaf view
	}

}
