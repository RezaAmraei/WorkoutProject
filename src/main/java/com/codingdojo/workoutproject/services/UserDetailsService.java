package com.codingdojo.workoutproject.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.workoutproject.models.UserDetails;
import com.codingdojo.workoutproject.repositories.UserDetailsRepository;

@Service
public class UserDetailsService {
	@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	// Find user details
	public UserDetails findUserDetailsById(Long id) {
		Optional<UserDetails> maybeUserDetails = userDetailsRepository.findById(id);
		if(maybeUserDetails.isPresent()) {
			return maybeUserDetails.get();
		}else {
			return null;
		}
	}
	//Create User Details
	public UserDetails createUserDetails(UserDetails userDetails) {
		return userDetailsRepository.save(userDetails);
	}
}
