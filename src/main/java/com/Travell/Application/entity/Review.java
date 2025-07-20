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
@Table(name="reviews")
public class Review {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="review_id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private Users user;
	
	@ManyToOne
	@JoinColumn(name="destination_id")
	private Destination destination;
	
	@Column(name="rating")
	private String rating;
	
	@Column(name="comment")
	private String comment;
	
	@Column(name="review_date")
	private LocalDateTime reviewDate;

	public Review(long id, Users user, Destination destination, String rating, String comment,
			LocalDateTime reviewDate) {
		super();
		this.id = id;
		this.user = user;
		this.destination = destination;
		this.rating = rating;
		this.comment = comment;
		this.reviewDate = reviewDate;
	}

	public Review() {
		super();
		// TODO Auto-generated constructor stub
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

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LocalDateTime getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(LocalDateTime reviewDate) {
		this.reviewDate = reviewDate;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", user=" + user + ", destination=" + destination + ", rating=" + rating
				+ ", comment=" + comment + ", reviewDate=" + reviewDate + "]";
	}
	
	
	
}
