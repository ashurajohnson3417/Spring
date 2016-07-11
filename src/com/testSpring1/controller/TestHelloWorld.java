package com.testSpring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestHelloWorld {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
//		this directs which jsp file its looking for, 
//		varname to be called inside of the jsp file, the actually value/s of whats being passed
		return new ModelAndView("welcome", "message", "Hello World");
	}
	@RequestMapping("/welcome2")
	public ModelAndView helloWorld2() {
		return new ModelAndView("welcome", "message1", "Hello World2");
	}
}