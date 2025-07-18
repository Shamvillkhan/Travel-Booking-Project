package com.Travell.Application.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.Travell.Application.entity.Gallery;

public interface GalleryService {
	
	public List<Gallery> getAllGalleryImages();
	public void deletGallery(long id);
	public void saveGallery(MultipartFile file,Gallery gallery) throws IOException;
}
