package com.Travell.Application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Travell.Application.entity.Booking;
import com.Travell.Application.entity.Users;
import com.Travell.Application.repository.BookingRepository;
import com.Travell.Application.repository.PackagesRepository;
import com.Travell.Application.repository.UsersRepository;

@Service
public class BookingServiceImpl implements BookingService {
	
	private UsersRepository userRepo;
	private BookingRepository bookingRepo;
	private PackagesRepository packagesRepo;
	
	public BookingServiceImpl(BookingRepository bookingRepo,PackagesRepository packagesRepo,UsersRepository userRepo) {
		this.bookingRepo=bookingRepo;
		this.userRepo=userRepo;
		this.packagesRepo=packagesRepo;
	}

	@Override
	public List<Booking> getAllBooking() {
		
		return bookingRepo.findAll();
	}

	@Override
	public Booking saveBooking(Booking booking) {
		booking.setUser(userRepo.getById(1));
		booking.setPackages(packagesRepo.getById(2L));
		
		
		return bookingRepo.save(booking);
	}

	@Override
	public void deletBooking(long id) {
		bookingRepo.deleteById(id);
		
	}

	@Override
	public Booking getOneBooking(long id) {
		
		return bookingRepo.getById(id);
	}

}
