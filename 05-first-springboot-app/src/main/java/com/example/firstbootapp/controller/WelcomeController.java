package com.example.firstbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcomeMsg")
	public ModelAndView DisplayWelcomeMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","this is springboot application..!!!!!!");
		mav.setViewName("welcome");
		return mav;
	}

}
