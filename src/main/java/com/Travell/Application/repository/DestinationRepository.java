package com.Travell.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Travell.Application.entity.Destination;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, Integer>{

}
