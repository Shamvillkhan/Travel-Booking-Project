package com.Travell.Application.service;

import java.util.Optional;

import com.Travell.Application.entity.Servicee;

public interface ServiceService {
	public Optional<Servicee> getService(long id);
	public void deletService(long id);
	public void saveService(Servicee service);
	
}
