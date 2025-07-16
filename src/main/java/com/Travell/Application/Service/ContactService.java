package com.Travell.Application.Service;

import java.util.List;
import java.util.Optional;

import com.Travell.Application.Entity.Contact;

public interface ContactService {
	
	List<Contact> getAllContacts();
	void saveContact(Contact contact);
	Optional<Contact> getOneContact(Long id);
	void deleteContact(Long id);
	void deleteAllContacts();
}
