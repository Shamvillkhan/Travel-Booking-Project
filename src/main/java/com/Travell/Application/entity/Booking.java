package com.Travell.Application.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="bookings")
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="booking_id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private Users user;
	
	@ManyToOne
	@JoinColumn(name="package_id")
	private Packages packages;
	
	@Column(name="booking_date")
	private LocalDateTime bookingDate;
	
	@Column(name="no_of_people")
	private int noOfPeople;
	
	@Column(name="total_amount")
	private int totalAmount;
	
	@Column(name="status")
	private String status;
	
	

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Booking(long id, Users user, Packages packages, LocalDateTime bookingDate, int noOfPeople, int totalAmount,
			String status) {
		super();
		this.id = id;
		this.user = user;
		this.packages = packages;
		this.bookingDate = bookingDate;
		this.noOfPeople = noOfPeople;
		this.totalAmount = totalAmount;
		this.status = status;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public Users getUser() {
		return user;
	}



	public void setUser(Users user) {
		this.user = user;
	}



	public Packages getPackages() {
		return packages;
	}



	public void setPackages(Packages packages) {
		this.packages = packages;
	}



	public LocalDateTime getBookingDate() {
		return bookingDate;
	}



	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}



	public int getNoOfPeople() {
		return noOfPeople;
	}



	public void setNoOfPeople(int noOfPeople) {
		this.noOfPeople = noOfPeople;
	}



	public int getTotalAmount() {
		return totalAmount;
	}



	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "Booking [id=" + id + ", user=" + user + ", packages=" + packages + ", bookingDate=" + bookingDate
				+ ", noOfPeople=" + noOfPeople + ", totalAmount=" + totalAmount + ", status=" + status + "]";
	}
	
	
	
	
	
}
