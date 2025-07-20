package com.Travell.Application.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.Travell.Application.entity.Blogs;

public interface BlogService {
	
	List<Blogs> getAllBlogs();
	void deleteBlog(long id);
	 
	Blogs saveBlogs(MultipartFile file ,Blogs blog) throws IOException;
}
