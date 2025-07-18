package com.Travell.Application.service;

import java.util.List;

import com.Travell.Application.entity.Users;

public interface UsersService {

	List<Users> list();
	Users save(Users users);
	void delete(int id);
	Users findById(int id);
	
}
