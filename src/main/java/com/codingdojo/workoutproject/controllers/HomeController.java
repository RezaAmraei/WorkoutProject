package com.codingdojo.workoutproject.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.workoutproject.models.User;
import com.codingdojo.workoutproject.models.Workout;
import com.codingdojo.workoutproject.repositories.WorkoutRepository;
import com.codingdojo.workoutproject.services.UserDetailsService;
import com.codingdojo.workoutproject.services.UserService;
import com.codingdojo.workoutproject.services.WorkoutService;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserDetailsService userDetailsService;
	@Autowired
	private WorkoutService workoutService;
	@Autowired
	private WorkoutRepository workoutRepository;
	
	@RequestMapping("/home")
	public String home(HttpSession session, Model model) {
		model.addAttribute("userName", session.getAttribute("userName"));
		if(session.getAttribute("userId") == null) {
			model.addAttribute("login", "login");
		}else{
			model.addAttribute("login", "logout");
		}
		return "home.jsp";
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		System.out.println("User has logged out");
		return "redirect:/home";
	}
	

	
	
}
