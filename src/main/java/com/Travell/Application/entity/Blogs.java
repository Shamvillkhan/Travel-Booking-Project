package com.Travell.Application.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
 

@Entity
@Table(name="blogs")
public class Blogs {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private Users user;
	
	@Column(name="title")
	private String title;
	
	@Column(name="image_name")
	private String imageName;
	
	@Column(name="image_path")
	private String imagePath;
	
	@Column(name="post_on")
	private LocalDateTime postOn;
	
	@Column(name="blog")
	private String blog;
	
	
	
	public Blogs() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Blogs(Long id, Users user, String title, String imageName, String imagePath, LocalDateTime postOn,
			String blog) {
		super();
		this.id = id;
		this.user = user;
		this.title = title;
		this.imageName = imageName;
		this.imagePath = imagePath;
		this.postOn = postOn;
		this.blog = blog;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Users getUser() {
		return user;
	}



	public void setUser(Users user) {
		this.user = user;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
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



	public String getBlog() {
		return blog;
	}



	public void setBlog(String blog) {
		this.blog = blog;
	}



	@Override
	public String toString() {
		return "Bolgs [id=" + id + ", user=" + user + ", title=" + title + ", imageName=" + imageName + ", imagePath="
				+ imagePath + ", postOn=" + postOn + ", blog=" + blog + "]";
	}
	
	
	
}
