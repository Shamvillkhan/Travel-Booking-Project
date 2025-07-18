package com.Travell.Application.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="service")
public class Servicee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="service")
	private String service;
	
	@Column(name="about_service")
	private String aboutService;

	
	
	public Servicee() {
		super();
	}



	public Servicee(long id, String service, String aboutService) {
		super();
		this.id = id;
		this.service = service;
		this.aboutService = aboutService;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getService() {
		return service;
	}



	public void setService(String service) {
		this.service = service;
	}



	public String getAboutService() {
		return aboutService;
	}



	public void setAboutService(String aboutService) {
		this.aboutService = aboutService;
	}



	@Override
	public String toString() {
		return "Service [id=" + id + ", service=" + service + ", aboutService=" + aboutService + "]";
	}



	
	
	
	
	
	
}
