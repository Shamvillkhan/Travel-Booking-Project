package com.Travell.Application.service;

import java.util.List;

import com.Travell.Application.entity.Review;

public interface ReviewService {
	
	List<Review> getAllReview();
	Review saveReview(Review review);
	void deleteReview(long id);
}

