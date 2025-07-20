package com.Travell.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Travell.Application.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

}
