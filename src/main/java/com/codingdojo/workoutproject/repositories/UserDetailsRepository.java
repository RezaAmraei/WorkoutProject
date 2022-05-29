package com.codingdojo.workoutproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.workoutproject.models.UserDetails;
@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetails,Long> {
	
}
