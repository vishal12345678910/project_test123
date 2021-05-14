package com.example.firstbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@RequestMapping("/welcome")
	public ModelAndView displayMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","welcome to springboot application-----!!!!");
		mav.setViewName("index");
		return mav;
	}

}
