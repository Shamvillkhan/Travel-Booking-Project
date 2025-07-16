package com.Travell.Application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Travell.Application.Entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
	
}
