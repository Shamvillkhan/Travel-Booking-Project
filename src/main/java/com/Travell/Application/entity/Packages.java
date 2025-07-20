package com.Travell.Application.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "packages")

public class Packages {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "package_id")
	private Long packageId;
	
	@ManyToOne
	@JoinColumn(name = "destination_id")
	private Destination destination;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "duration_days")
	private int durationDays;

	@Column(name = "start_date")
	private LocalDate startDate;

	@Column(name = "end_date")
	private LocalDate endDate;

	public Packages() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Packages(Long packageId, Destination destination, String title, String description, BigDecimal price,
			int durationDays, LocalDate startDate, LocalDate endDate) {
		super();
		this.packageId = packageId;
		this.destination = destination;
		this.title = title;
		this.description = description;
		this.price = price;
		this.durationDays = durationDays;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Long getPackageId() {
		return packageId;
	}

	public void setPackageId(Long packageId) {
		this.packageId = packageId;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getDurationDays() {
		return durationDays;
	}

	public void setDurationDays(int durationDays) {
		this.durationDays = durationDays;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Packages [packageId=" + packageId + ", destination=" + destination + ", title=" + title
				+ ", description=" + description + ", price=" + price + ", durationDays=" + durationDays
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}

	
	
	
	
}
