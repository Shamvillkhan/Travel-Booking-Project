package com.Travell.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Travell.Application.entity.About;

@Repository
public interface AboutRepository extends JpaRepository<About, Long>{
	About findByActiveTrue();


}
