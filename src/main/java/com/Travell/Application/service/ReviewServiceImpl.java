package com.Travell.Application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Travell.Application.entity.Review;
import com.Travell.Application.repository.DestinationRepository;
import com.Travell.Application.repository.ReviewRepository;
import com.Travell.Application.repository.UsersRepository;

@Service
public class ReviewServiceImpl implements ReviewService {
	
	private ReviewRepository reviewRepo;
	private UsersRepository userRepo;
	private DestinationRepository destinationRepo;
	public ReviewServiceImpl(ReviewRepository reviewRepo,UsersRepository userRepo,DestinationRepository destinationRepo) {
		this.reviewRepo=reviewRepo;
		this.userRepo=userRepo;
		this.destinationRepo=destinationRepo;
	}

	@Override
	public List<Review> getAllReview() {
		return reviewRepo.findAll();
	}

	@Override
	public Review saveReview(Review review) {
		 review.setUser(userRepo.getById(1));
		 review.setDestination(destinationRepo.getById(1));
		return reviewRepo.save(review);
	}

	@Override
	public void deleteReview(long id) {
		reviewRepo.deleteById(id);
		
	}

}
