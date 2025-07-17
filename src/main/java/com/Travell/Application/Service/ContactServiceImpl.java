package com.Travell.Application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Travell.Application.entity.Contact;
import com.Travell.Application.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository contactRepo;
	
	public ContactServiceImpl(ContactRepository contactRepo) {
		this.contactRepo=contactRepo;
	}

	@Override
	public List<Contact> getAllContacts() {
		
		return contactRepo.findAll();
	}

	@Override
	public void saveContact(Contact contact) {
		
		 contactRepo.save(contact);
	}

	@Override
	public Optional<Contact> getOneContact(Long id) {
		
		return contactRepo.findById(id);
	}

	@Override
	public void deleteContact(Long id) {
		
		contactRepo.deleteById(id);
	}

	@Override
	public void deleteAllContacts() {
		// TODO Auto-generated method stub
		 contactRepo.deleteAll();
	}

}
