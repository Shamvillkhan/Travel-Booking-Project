package com.Travell.Application.service;

import java.util.List;
import java.util.Optional;

import com.Travell.Application.entity.Booking;

public interface BookingService {
	
	List<Booking> getAllBooking();
	Booking saveBooking(Booking booking);
	void deletBooking(long id);
	Booking getOneBooking(long id);
}
