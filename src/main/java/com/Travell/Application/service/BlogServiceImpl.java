package com.Travell.Application.service;

import java.io.IOException;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.Travell.Application.entity.Blogs;
import com.Travell.Application.repository.BlogRepository;
import com.Travell.Application.repository.UsersRepository;

import FIleUpload.FileUploadUtil;

@Service
public class BlogServiceImpl implements BlogService {
	
	private BlogRepository blogRepo;
	private UsersRepository userRepo;
	
	public BlogServiceImpl(BlogRepository blogRepo,UsersRepository userRepo) {
		this.blogRepo=blogRepo;
		this.userRepo=userRepo;
		
	}

	@Override
	public List<Blogs> getAllBlogs() {
		
		return blogRepo.findAll();
	}

	@Override
	public void deleteBlog(long id) {
		blogRepo.deleteById(id);
		
	}

	@Override
	public Blogs saveBlogs(MultipartFile file, Blogs blog) throws IOException {
		blog.setUser(userRepo.getById(1));
		blog.setImageName(FileUploadUtil.saveFile(file));
		blog.setImagePath(FileUploadUtil.UPLOAD_DIR+file);
		return blogRepo.save(blog);
	}


	 

}
