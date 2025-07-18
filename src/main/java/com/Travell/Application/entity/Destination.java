package com.Travell.Application.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "destinations")
public class Destination {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "destination_id")
	private long destinationId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "image_url")
	private String imageURL;

	public Destination() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Destination(long destinationId, String name, String country, String description, String imageURL) {
		super();
		this.destinationId = destinationId;
		this.name = name;
		this.country = country;
		this.description = description;
		this.imageURL = imageURL;
	}

	public long getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(long destinationId) {
		this.destinationId = destinationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	@Override
	public String toString() {
		return "Destination [destinationId=" + destinationId + ", name=" + name + ", country=" + country
				+ ", description=" + description + ", imageURL=" + imageURL + "]";
	}
	
	
	
	
}
