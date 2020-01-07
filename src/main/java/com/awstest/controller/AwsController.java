package com.awstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AwsController {
	
	@GetMapping("/")
	public ModelAndView mv() {
		ModelAndView mv = new ModelAndView("test");
		return mv;
	}

}
