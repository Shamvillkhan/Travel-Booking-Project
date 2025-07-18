package com.Travell.Application.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="about")
public class About {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="about_us")
	private String aboutUs;

	@Column(name="trip_done")
	private String tripDone;
	
	@Column(name="corporate_clients")
	private String corporateClients;
	
	@Column(name="visited_countries")
	private String visitedCountries;
	
	@Column(name="team_members")
	private String teamMembers;
	
	@Column(name="active")
	private boolean active;

	public About() {
		super();
		// TODO Auto-generated constructor stub
	}

	public About(long id, String aboutUs, String tripDone, String corporateClients, String visitedCountries,
			String teamMembers, boolean active) {
		super();
		this.id = id;
		this.aboutUs = aboutUs;
		this.tripDone = tripDone;
		this.corporateClients = corporateClients;
		this.visitedCountries = visitedCountries;
		this.teamMembers = teamMembers;
		this.active = active;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAboutUs() {
		return aboutUs;
	}

	public void setAboutUs(String aboutUs) {
		this.aboutUs = aboutUs;
	}

	public String getTripDone() {
		return tripDone;
	}

	public void setTripDone(String tripDone) {
		this.tripDone = tripDone;
	}

	public String getCorporateClients() {
		return corporateClients;
	}

	public void setCorporateClients(String corporateClients) {
		this.corporateClients = corporateClients;
	}

	public String getVisitedCountries() {
		return visitedCountries;
	}

	public void setVisitedCountries(String visitedCountries) {
		this.visitedCountries = visitedCountries;
	}

	public String getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(String teamMembers) {
		this.teamMembers = teamMembers;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "About [id=" + id + ", aboutUs=" + aboutUs + ", tripDone=" + tripDone + ", corporateClients="
				+ corporateClients + ", visitedCountries=" + visitedCountries + ", teamMembers=" + teamMembers
				+ ", active=" + active + "]";
	}



	
	
	
}
