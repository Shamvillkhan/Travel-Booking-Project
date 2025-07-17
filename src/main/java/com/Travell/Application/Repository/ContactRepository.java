package com.Travell.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Travell.Application.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
	
}
