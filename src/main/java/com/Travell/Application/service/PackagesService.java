package com.Travell.Application.service;

import java.util.List;

import com.Travell.Application.entity.Packages;

public interface PackagesService {

	public List<Packages> listAll();

	public void save(Packages p);

	public Packages get(Long id);

	public void delete(Long id);
}
