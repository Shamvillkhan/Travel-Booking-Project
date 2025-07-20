package com.Travell.Application.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.multipart.MultipartFile;

import com.Travell.Application.entity.Blogs;
import com.Travell.Application.service.BlogService;

@Controller
@RequestMapping("/blogs")
public class BlogController {
	
	private BlogService blogService;
	
	public BlogController(BlogService blogService) {
		this.blogService=blogService;
	}
	
	@GetMapping("/form")
	public String getForm(Model model){
		model.addAttribute("blog",new Blogs());
		return "blog-form";
	}
	
	@PostMapping("/save")
	public String saveBlog(@RequestParam("imageFile") MultipartFile file,@ModelAttribute Blogs blog) throws IOException {
		blogService.saveBlogs(file,blog);
		return "redirect:/blog";
	}
}
