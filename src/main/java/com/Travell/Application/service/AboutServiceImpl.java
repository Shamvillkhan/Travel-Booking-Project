package com.Travell.Application.service;

import org.springframework.stereotype.Service;

import com.Travell.Application.entity.About;
import com.Travell.Application.repository.AboutRepository;

@Service
public class AboutServiceImpl implements AboutService {
	
	private AboutRepository aboutRepo;
	
	
	public AboutServiceImpl(AboutRepository aboutRepo)
	{
		this.aboutRepo=aboutRepo;
	}
	@Override
	public About getAbout() {
		About about=aboutRepo.findByActiveTrue();
		if(about.isActive()) {
			return about;
		}
		return null ;
	}

	@Override
	public void deletAbout(long id) {
		aboutRepo.deleteById(id);
		
	}

	

	@Override
	public void saveAbout(About about) {
		aboutRepo.save(about);
		
	}

}
