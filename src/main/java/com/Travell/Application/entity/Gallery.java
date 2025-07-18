package com.Travell.Application.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="gallery")
public class Gallery {
 
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="about_place")
	private  String aboutPlace;
	
	@Column(name="image_name")
	private String imageName;
	
	@Column(name="image_path")
	private String imagePath;
	
	@Column(name="post_on")
	private LocalDateTime postOn;

	public Gallery(Long id, String aboutPlace, String imageName, String imagePath, LocalDateTime postOn) {
		super();
		this.id = id;
		this.aboutPlace = aboutPlace;
		this.imageName = imageName;
		this.imagePath = imagePath;
		this.postOn = postOn;
	}

	public Gallery() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAboutPlace() {
		return aboutPlace;
	}

	public void setAboutPlace(String aboutPlace) {
		this.aboutPlace = aboutPlace;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public LocalDateTime getPostOn() {
		return postOn;
	}

	public void setPostOn(LocalDateTime postOn) {
		this.postOn = postOn;
	}

	@Override
	public String toString() {
		return "Gallery [id=" + id + ", aboutPlace=" + aboutPlace + ", imageName=" + imageName + ", imagePath="
				+ imagePath + ", postOn=" + postOn + "]";
	}
	
	
	
	
	
	
}
