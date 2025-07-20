package com.Travell.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Travell.Application.entity.Blogs;

@Repository
public interface BlogRepository extends JpaRepository<Blogs, Long>{

}
