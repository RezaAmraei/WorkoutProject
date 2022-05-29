package com.codingdojo.workoutproject.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.workoutproject.models.Workout;
import com.codingdojo.workoutproject.repositories.WorkoutRepository;

@Service
public class WorkoutService {
	@Autowired
	private WorkoutRepository workoutRepository;
	
	//Find Work out
	//Find by id
	public Workout findById(Long id) {
		Optional<Workout> maybeWorkout = workoutRepository.findById(id);
		if(maybeWorkout.isPresent()) {
			return maybeWorkout.get();
		}else {
			return null;
		}
	}
	//Create Work out
	public Workout createWorkout(Workout workout) {
		return workoutRepository.save(workout);
	}
	//Edit Work out
	
	//Delete Work out
}
