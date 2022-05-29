package com.codingdojo.workoutproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WorkoutRoutineController {
	@RequestMapping("/view/all/routines")
	public String viewAllRoutines() {
		return "allroutines.jsp";
	}
	@RequestMapping("/view/all/view/chest")
	public String viewChest(Model model) {
		model.addAttribute("linkbeg", "https://www.mensjournal.com/health-fitness/10-best-chest-exercises-beginners/");
		model.addAttribute("linkint", "https://cairogyms.com/chest-workout-intermediate-level/");
		model.addAttribute("linkadv", "https://www.tigerfitness.com/blogs/workouts/chest-exercises-alternatives");
		return "workoutroutine.jsp";
	}
	@RequestMapping("/view/legs")
	public String viewLegs(Model model) {
		model.addAttribute("linkbeg", "https://www.bodybuilding.com/content/5-leg-workouts-for-mass-a-beginners-guide.html");
		model.addAttribute("linkint", "https://vshred.com/blog/ultimate-leg-day-workout/");
		model.addAttribute("linkadv", "https://www.dymatize-athletic-nutrition.com/en_GB/why-dymatize/blog/advanced-leg-day-the-best-exercises-for-more-volume");
		return "workoutroutine.jsp";
	}
	@RequestMapping("/view/back")
	public String viewBack(Model model) {
		model.addAttribute("linkbeg", "https://www.mensjournal.com/health-fitness/10-best-chest-exercises-beginners/");
		model.addAttribute("linkint", "https://cairogyms.com/chest-workout-intermediate-level/");
		model.addAttribute("linkadv", "https://www.tigerfitness.com/blogs/workouts/chest-exercises-alternatives");
		return "workoutroutine.jsp";
	}
	@RequestMapping("/view/shoulders")
	public String viewShoulders(Model model) {
		model.addAttribute("linkbeg", "https://www.mensjournal.com/health-fitness/10-best-chest-exercises-beginners/");
		model.addAttribute("linkint", "https://cairogyms.com/chest-workout-intermediate-level/");
		model.addAttribute("linkadv", "https://www.tigerfitness.com/blogs/workouts/chest-exercises-alternatives");
		return "workoutroutine.jsp";
	}
	@RequestMapping("/view/all/view/biceps")
	public String viewBiceps(Model model) {
		model.addAttribute("linkbeg", "https://www.mensjournal.com/health-fitness/10-best-chest-exercises-beginners/");
		model.addAttribute("linkint", "https://cairogyms.com/chest-workout-intermediate-level/");
		model.addAttribute("linkadv", "https://www.tigerfitness.com/blogs/workouts/chest-exercises-alternatives");
		return "workoutroutine.jsp";
	}
	@RequestMapping("/view/triceps")
	public String viewTriceps(Model model) {
		model.addAttribute("linkbeg", "https://www.mensjournal.com/health-fitness/10-best-chest-exercises-beginners/");
		model.addAttribute("linkint", "https://cairogyms.com/chest-workout-intermediate-level/");
		model.addAttribute("linkadv", "https://www.tigerfitness.com/blogs/workouts/chest-exercises-alternatives");
		return "workoutroutine.jsp";
	}
	@RequestMapping("/view/cardio")
	public String viewCardio(Model model) {
		model.addAttribute("linkbeg", "https://www.mensjournal.com/health-fitness/10-best-chest-exercises-beginners/");
		model.addAttribute("linkint", "https://cairogyms.com/chest-workout-intermediate-level/");
		model.addAttribute("linkadv", "https://www.tigerfitness.com/blogs/workouts/chest-exercises-alternatives");
		return "workoutroutine.jsp";
	}
	@RequestMapping("/view/core")
	public String viewCore(Model model) {
		model.addAttribute("linkbeg", "https://www.mensjournal.com/health-fitness/10-best-chest-exercises-beginners/");
		model.addAttribute("linkint", "https://cairogyms.com/chest-workout-intermediate-level/");
		model.addAttribute("linkadv", "https://www.tigerfitness.com/blogs/workouts/chest-exercises-alternatives");
		return "workoutroutine.jsp";
	}
	@RequestMapping("/view/athome")
	public String viewAtHome(Model model) {
		model.addAttribute("linkbeg", "https://greatist.com/fitness/at-home-workouts-for-beginners#at-home-workout");
		model.addAttribute("linkint", "https://livelighter.com.au/Assets/resource/physical-activity/PA-Resource_Home-Workout-Intermediate.pdf");
		model.addAttribute("linkadv", "https://countdownfit.com/advanced-at-home-workout/");
		return "workoutroutine.jsp";
	}

}
