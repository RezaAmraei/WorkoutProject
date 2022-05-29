package com.codingdojo.workoutproject.models;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "First Name is requried!")
	@Size(min = 3, max = 30, message = "First Name must be between 3 characters and 30 characters")
	private String fName;
	
	@NotEmpty(message = "Last Name is requried!")
	@Size(min = 3, max = 30, message = "Last Name must be between 3 characters and 30 characters")
	private String lName;
	
	@NotEmpty(message = "Email is requried!")
	@Email(message = "Please enter a valid email")
	private String email;
	
	@NotEmpty(message = "Password is requried!")
	@Size(min = 8, max = 120, message = "Password must be between 8 characters and 120 characters")
	private String password;

	@Transient
	@NotEmpty(message = "Confirm Password is requried!")
	@Size(min = 8, max = 120, message = "Password must be between 8 characters and 120 characters")
	private String confirm;
	
	@OneToOne(mappedBy="user", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private UserDetails userDetails;
//	@OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
//	private List<Book> books;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Workout> workouts;
	
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;
	
	
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	public User() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	public UserDetails getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	public List<Workout> getWorkouts() {
		return workouts;
	}
	public void setWorkouts(List<Workout> workouts) {
		this.workouts = workouts;
	}
	
	
}
