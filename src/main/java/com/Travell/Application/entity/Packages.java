package com.Travell.Application.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "packages")

public class Packages {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "package_id")
	private Long packageId;

	@Column(name = "destination_id")
	private Long destinationId;

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

	public Packages(Long packageId, Long destinationId, String title, String description, BigDecimal price,
			int durationDays, LocalDate startDate, LocalDate endDate) {
		super();
		this.packageId = packageId;
		this.destinationId = destinationId;
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

	public Long getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(Long destinationId) {
		this.destinationId = destinationId;
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
		return "Packages [packageId=" + packageId + ", destinationId=" + destinationId + ", title=" + title
				+ ", description=" + description + ", price=" + price + ", durationDays=" + durationDays
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
	
}
