package com.Travell.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Travell.Application.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{

}
