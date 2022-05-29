package com.codingdojo.workoutproject.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.workoutproject.models.User;
import com.codingdojo.workoutproject.models.Workout;
@Repository
public interface WorkoutRepository extends CrudRepository<Workout,Long> {
	List<Workout> findByUserAndDateOfWorkout(User user, String date);
}
