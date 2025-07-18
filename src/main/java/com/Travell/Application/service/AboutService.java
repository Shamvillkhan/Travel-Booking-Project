package com.Travell.Application.service;

import com.Travell.Application.entity.About;

public interface AboutService {
	public About getAbout();
	public void deletAbout(long id);
	public void saveAbout(About about);
	
}
