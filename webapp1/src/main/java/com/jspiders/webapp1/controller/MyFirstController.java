package com.jspiders.webapp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyFirstController {

	@Autowired
	private JdbcTemplate jdbctemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	@RequestMapping("/")
	public ModelAndView UserRegistration() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("registration");
		return mv;

	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user") User user) {
		// System.out.printuser01registrationln(user);

		String query = " insert into UserDetails values(?,?,?,?) ";
		int result = jdbctemplate.update(query, user.getId(), user.getName(), user.getEmail(), user.getPassword());

		ModelAndView mv = new ModelAndView();
		mv.addObject("user1", user);
		mv.setViewName("registration");
		return mv;// add some attribute using setAttribute()

		/*
		 * ModelMap m = new ModelMap("user1", user); String url="registration"; return
		 * url;
		 */
	}

	@RequestMapping("/home")
	public ModelAndView home() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("displayAllUser");
		return mv;

		/*
		 * String url="displayAllUser"; return url;
		 */

	}

	@RequestMapping(value = "displayAllUserDetails")
	public ModelAndView DisplayAllUserDetails() {

		UserRowMapper rowMapper = new UserRowMapper();
		String query = " select * from UserDetails ";
		List<User> user = jdbctemplate.query(query, rowMapper);

		ModelAndView mv = new ModelAndView();
		mv.addObject("user2", user);
		mv.setViewName("displayAllUser");
		return mv;

		/*
		 * ModelMap m = new ModelMap("user2", user); String url="displayAllUser"; return
		 * url;
		 */

	}

	// Validate User Input
	@RequestMapping("/Login")
	public String UserLogin() {

		String url = "Login";
		return url;

	}

	@RequestMapping(value = "ValidateUser", method = RequestMethod.POST)
	public ModelAndView ValidateUser(@ModelAttribute("user") User user) {
		UserRowMapper rowMapper = new UserRowMapper();
		String query = " select Name,ID,Email,Password from userdetails where ID = ? && Password = ? ";
		User user1 = null;
		ModelAndView mv;
		try {
			user1 = jdbctemplate.queryForObject(query, rowMapper, user.getId(), user.getPassword());
			mv = new ModelAndView();
			mv.addObject("user2", user1);
			mv.setViewName("display");
		}

		catch (Exception e) {
			mv = new ModelAndView();
			mv.addObject("user2", "Invalid-User");
			mv.setViewName("display2");
		}

		return mv;

	}

}
