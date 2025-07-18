package com.Travell.Application.service;

import java.io.IOException;
import java.util.List;

import org.apache.tomcat.util.http.fileupload.FileUpload;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.Travell.Application.entity.Gallery;
import com.Travell.Application.repository.GalleryRepository;

import FIleUpload.FileUploadUtil;

@Service
public class GalleryServiceImpl implements GalleryService {
	
	private GalleryRepository galleryRepo;
	
	public GalleryServiceImpl(GalleryRepository galleryRepo) {
		this.galleryRepo=galleryRepo;
	}

	@Override
	public List<Gallery> getAllGalleryImages() {
		// TODO Auto-generated method stub
		return galleryRepo.findAll();
	}

	@Override
	public void deletGallery(long id) {
		galleryRepo.deleteById(id);
		
	}

	@Override
	public void saveGallery(MultipartFile file,Gallery gallery) throws IOException {
		
		String filee=FileUploadUtil.saveFile(file);
		gallery.setImageName(filee);
		gallery.setImagePath(FileUploadUtil.UPLOAD_DIR+filee);
		galleryRepo.save(gallery);
		
	}

}
