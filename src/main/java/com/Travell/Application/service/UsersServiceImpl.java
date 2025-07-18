package com.Travell.Application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Travell.Application.entity.Users;
import com.Travell.Application.repository.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService{
    @Autowired
	private UsersRepository repository;	
	@Override
	public List<Users> list() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Users save(Users users) {
		// TODO Auto-generated method stub
		return repository.save(users);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Users findById(int id) {
		// TODO Auto-generated method stub
		Optional<Users> optional = repository.findById(id);
		return optional.get();
	}

	
	
}
