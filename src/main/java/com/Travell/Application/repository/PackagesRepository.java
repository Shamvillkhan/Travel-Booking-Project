package com.Travell.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Travell.Application.entity.Packages;
@Repository
public interface PackagesRepository extends JpaRepository<Packages, Long> {

}
