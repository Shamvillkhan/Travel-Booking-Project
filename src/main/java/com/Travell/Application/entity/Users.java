package com.Travell.Application.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity(name ="users")
public class Users {

	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "user_id")
		private long userId;
		
		@Column(name = "name")
		private String name;
		
		@Column(name = "email")
		private String email;
		
	
		@Column(name = "phone")
		private String phone;
		
		@Column(name = "password")
		private String password;
		
		@Column(name = "created_at")
		private Timestamp timeStamp;

		public Users() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Users(long userId, String name, String email, String phone, String password, Timestamp timeStamp) {
			super();
			this.userId = userId;
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.password = password;
			this.timeStamp = timeStamp;
		}

		public long getUserId() {
			return userId;
		}

		public void setUserId(long userId) {
			this.userId = userId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Timestamp getTimeStamp() {
			return timeStamp;
		}

		public void setTimeStamp(Timestamp timeStamp) {
			this.timeStamp = timeStamp;
		}

		@Override
		public String toString() {
			return "Users [userId=" + userId + ", name=" + name + ", email=" + email + ", phone=" + phone
					+ ", password=" + password + ", timeStamp=" + timeStamp + "]";
		}

}
