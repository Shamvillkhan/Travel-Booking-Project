package com.Travell.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Travell.Application.entity.Gallery;

@Repository
public interface GalleryRepository extends JpaRepository<Gallery, Long> {

}
