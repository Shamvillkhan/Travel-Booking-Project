package com.Travell.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Travell.Application.entity.Servicee;

@Repository
public interface ServiceRepository extends JpaRepository<Servicee, Long> {

}
