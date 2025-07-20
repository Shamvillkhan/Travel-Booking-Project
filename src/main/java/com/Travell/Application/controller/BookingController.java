package com.Travell.Application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Travell.Application.entity.Booking;
import com.Travell.Application.service.BookingService;

@Controller
@RequestMapping("/bookings")
public class BookingController {
	private BookingService bookingService;
	
	public BookingController(BookingService bookingService) {
		this.bookingService=bookingService;
	}
	
	@GetMapping("/form")
	public String getForm(Model model) {
		model.addAttribute("booking",new Booking());
		return "booking-form";
	}
	
	@PostMapping("/save")
	public String saveBooing(@ModelAttribute Booking booking) {
		bookingService.saveBooking(booking);
		return "redirect:/";
	}
	
//	@GetMapping("/getonebooking{id}")
//	public String getOneBooking(@PathVariable long id,Model model) {
//		model.addAttribute("bookingOne",bookingService.getOneBooking(id));
//		return "booking";
//	}

}
