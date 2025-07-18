package com.Travell.Application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Travell.Application.entity.Destination;
import com.Travell.Application.repository.DestinationRepository;
@Service 
public class DestinationServiceImpl implements DestinationService {
	
	@Autowired
	private DestinationRepository repository;

	
	@Override
	public List<Destination> lis() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Destination save(Destination destination) {
		// TODO Auto-generated method stub
		return repository.save(destination);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Destination findById(int id) {
		// TODO Auto-generated method stub
		Optional<Destination> optional = repository.findById(id);
		return optional.get();
	}
	
	
}
