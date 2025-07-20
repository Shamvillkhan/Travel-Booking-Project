package com.Travell.Application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Travell.Application.entity.Review;
import com.Travell.Application.service.ReviewService;

@Controller
@RequestMapping("/reviews")
public class ReviewController {
	
	private ReviewService reviewService;
	
	public ReviewController(ReviewService reviewService) {
		this.reviewService=reviewService;
		
	}
	
	@GetMapping("/form")
	public String getForm(Model model) {
		model.addAttribute("review",new Review());
		return "review-form";
	}
	
	@PostMapping("/save")
	public String saveReviews(@ModelAttribute Review review) {
		 reviewService.saveReview(review);
		return "redirect:/";
		
	}
	
}
