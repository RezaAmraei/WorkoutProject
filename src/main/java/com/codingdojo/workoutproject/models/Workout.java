package com.codingdojo.workoutproject.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="workouts")
public class Workout {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "Exercise name is requried!")
	@Size(min = 3, max = 50, message = "Exercise Name must be between 3 characters and 50 characters")
	private String exercise;
	
	@NotNull(message = "Sets are requried!")
	@Range(min = 1, max = 50, message = "Sets must be between 1 and 50 sets")
	private int sets;
	
	@NotNull(message = "Reps are requried!")
	@Range(min = 1, max = 500, message = "Reps must be between 1 and 500 reps")
	private int reps;
	
	@NotNull(message = "Weight is requried!")
	@Range(min = 1, max = 1000, message = "Weight must be between 1 and 1000 pounds, if over youre too strong for this website")
	private double exerciseWeight;
	
	@NotEmpty(message = "Date is requried!")
	private String dateOfWorkout;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	public Workout() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getExercise() {
		return exercise;
	}
	public void setExercise(String exercise) {
		this.exercise = exercise;
	}
	public int getSets() {
		return sets;
	}
	public void setSets(int sets) {
		this.sets = sets;
	}
	public int getReps() {
		return reps;
	}
	public void setReps(int reps) {
		this.reps = reps;
	}
	public double getExerciseWeight() {
		return exerciseWeight;
	}
	public void setExerciseWeight(double exerciseWeight) {
		this.exerciseWeight = exerciseWeight;
	}
	public String getDateOfWorkout() {
		return dateOfWorkout;
	}
	public void setDateOfWorkout(String dateOfWorkout) {
		this.dateOfWorkout = dateOfWorkout;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
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
	
}
