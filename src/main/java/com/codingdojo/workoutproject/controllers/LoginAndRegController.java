package com.codingdojo.workoutproject.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.workoutproject.models.LoginUser;
import com.codingdojo.workoutproject.models.User;
import com.codingdojo.workoutproject.models.UserDetails;
import com.codingdojo.workoutproject.services.UserDetailsService;
import com.codingdojo.workoutproject.services.UserService;

@Controller
public class LoginAndRegController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserDetailsService userDetailsService;
	@RequestMapping("/")
	public String index() {

		return "redirect:/home";
	}

	// LOGGING IN
	@RequestMapping("/login")
	public String login(@ModelAttribute("loginUser") User user) {
		return "login.jsp";
	}

	@PostMapping("/logging/in")
	public String loggingIn(@Valid @ModelAttribute("loginUser") LoginUser newLogin, BindingResult result, Model model,
			HttpSession session) {
		User user = userService.login(newLogin, result);
		if (result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "login.jsp";
		}
		session.setAttribute("userId", user.getId());
		session.setAttribute("userName", user.getfName());
		return "redirect:/home";

	}

	// REGISTERING
	@RequestMapping("/register/account")
	public String register(@ModelAttribute("newUser") User user, Model model) {
		return "register.jsp";
	}

	@RequestMapping("/register/details")
	public String registerDetails(@ModelAttribute("newUserDetails") UserDetails userDetails, Model model, HttpSession session) {
		//User user = userService.findById((Long) session.getAttribute("userId"));
		Long id = (Long) session.getAttribute("userId");
		model.addAttribute("id",id);
		return "registerdetails.jsp";
	}

	@PostMapping("/registering/account")
	public String registeringAccount(@Valid @ModelAttribute("newUser") User user, BindingResult result, Model model,
			HttpSession session) {
		System.out.println(user.getfName());
		userService.register(user, result);
		if (result.hasErrors()) {
			System.out.println("Error has happned");
			return "register.jsp";
		}
		
		session.setAttribute("userId", user.getId());
		return "redirect:/register/details";
	}
	
		
	
	@PostMapping("/registering/details")
	public String registeringDetails(@Valid @ModelAttribute("newUserDetails") UserDetails userDetails, BindingResult result,
			HttpSession session, Model model) {
		if (result.hasErrors()) {
			System.out.println("registering details error has hit");
			return "registerdetails.jsp";
		} else {
			//Long id = (Long) session.getAttribute("userId");
			//model.addAttribute("id", id);
			System.out.println("no errors");
			userDetailsService.createUserDetails(userDetails);
			//userService.registerDetails(id, user.getAge(), user.getWeight(), user.getHeight(), user.getGender());
			return "redirect:/home";
		}
	}
}
