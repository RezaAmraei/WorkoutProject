package com.codingdojo.workoutproject.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.workoutproject.models.LoginUser;
import com.codingdojo.workoutproject.models.User;
import com.codingdojo.workoutproject.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
//	public UserService(UserRepository userRepository) {
//		this.userRepository = userRepository;
//	}
	//Find user by id
	public User findById(Long id) {
		Optional<User> maybeUser = userRepository.findById(id);
		if(maybeUser.isPresent()) {
			return maybeUser.get();
		}else {
			return null;
		}
	}
	//CREATE USER
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	// TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {
        // TO-DO: Additional validations!
    	Optional<User> maybeUser = userRepository.findByEmail(newUser.getEmail());

    	if(maybeUser.isPresent() == true) {
    		System.out.println("Email is already taken");
    		result.rejectValue("email", "unique", "Email already exist");
    	}
    	System.out.println(newUser.getPassword() + "--"+ newUser.getConfirm());
    	
    	if(!newUser.getPassword().equals(newUser.getConfirm())) {
    		System.out.println("Confirm password has errors hit line hit");
    		 result.rejectValue("password", "matches", "The confirm password does not match the Password");		 
    	}
    	if(result.hasErrors()) {
    		System.out.println("Result has errors hit line hit");
    		return null;
    	}
    	
    	String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
    	newUser.setPassword(hashed);
        return userRepository.save(newUser);
    }
    public User registerDetails(Long id, Integer age, Double weight, Double height, String gender) {
    	User newUserDetails = userRepository.findById(id).get();
    	if(newUserDetails != null) {
    		System.out.println("setting data has hit");
//    		newUserDetails.setAge(age);
//    		newUserDetails.setWeight(weight);
//    		newUserDetails.setHeight(height);
//    		newUserDetails.setGender(gender);
    		return userRepository.save(newUserDetails);		
    	}else {
    		return null;
    	}
    }
    public User login(LoginUser newLoginObject, BindingResult result) {
        // TO-DO: Additional validations!
    	Optional<User> maybeUser = userRepository.findByEmail(newLoginObject.getEmail());
    	if(!maybeUser.isPresent()) {
    		result.rejectValue("email", "unique", "Unknown email");
    		return null;
    		
    	}
    	User user = maybeUser.get();
    	System.out.println(user.getPassword());
    	if(!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())){
    		result.rejectValue("password", "matches", "Incorrect password");
    		return null;
    	}
    	if(result.hasErrors()) {
    		return null;
    	}
        return user;
    }
}
