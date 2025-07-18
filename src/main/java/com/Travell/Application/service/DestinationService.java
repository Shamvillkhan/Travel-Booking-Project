package com.Travell.Application.service;

import java.util.List;

import com.Travell.Application.entity.Destination;

public interface DestinationService {

	List<Destination> lis();
	Destination save(Destination destination);
	void delete(int id);
	Destination findById(int id);
	
	
	
}
