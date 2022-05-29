package com.codingdojo.workoutproject.controllers;

import java.util.ArrayList;
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
public class WorkoutController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserDetailsService userDetailsService;
	@Autowired
	private WorkoutService workoutService;
	@Autowired
	private WorkoutRepository workoutRepository;
	@RequestMapping("/log/workout")
	public String logWorkout(@ModelAttribute("newWorkout")Workout workout, HttpSession session, Model model) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/login";
		}
		return "createworkout.jsp";
	}
	@PostMapping("/create/workout")
	public String createWorkout(@Valid @ModelAttribute("newWorkout")Workout workout, BindingResult result, HttpSession session, Model model) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/login";
		}
		if(result.hasErrors()) {
			System.out.println("Ran into errors");
			return "createworkout.jsp";
		}
		String date = (String) session.getAttribute("date");
		Long id = (Long) session.getAttribute("userId");
		
		User user = userService.findById(id);
		workout.setUser(user);
		workoutService.createWorkout(workout);
		model.addAttribute("date", date);
		System.out.println(session.getAttribute("allCurrWorkouts"));
		return "redirect:/home";
	}
	
	@RequestMapping("/find/workout")
	public String selectDate(HttpSession session, Model model) {
		
		return "selectdate.jsp";
	}
	
	@PostMapping("/finding/workout")
	public String findingWorkout(@RequestParam(name="date") String workoutDate, HttpSession session) {
		session.setAttribute("date", workoutDate);
		
		return "redirect:/view/workout";
	}
	
	@RequestMapping("/view/workout")
	public String viewWorkout(Model model, HttpSession session) {
		//model.addAttribute("date", session.getAttribute("date"));
		String date = (String) session.getAttribute("date");
		Long id = (Long) session.getAttribute("userId");
		User currUser = userService.findById(id);
		List<Workout> allWorkouts = workoutRepository.findByUserAndDateOfWorkout(currUser,date);
		model.addAttribute("allWorkouts", allWorkouts);
		model.addAttribute("date", date);
		
		return "viewworkout.jsp";
	}
}
