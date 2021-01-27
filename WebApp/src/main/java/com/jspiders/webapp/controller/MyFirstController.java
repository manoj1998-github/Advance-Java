package com.jspiders.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyFirstController {
	
	@RequestMapping("/display")
	public ModelAndView display()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("MyFirstJSP");
		return mv;
	}
	
	@RequestMapping("/primitive")
	public ModelAndView primitiveType()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", 101);
		mv.addObject("name", "king");
		mv.setViewName("MySecondJSP");
		return mv;
	}
	
	@RequestMapping("/collection")
	public ModelAndView collectionType()
	{
		ModelAndView mv = new ModelAndView();
		Student student = new Student();
		mv.addObject("student", student);
		student.setId(100);
		student.setName("manoj");
		mv.setViewName("MyThirdJSP");
		return mv;
	}
	

}
