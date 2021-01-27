package com.jspiders.SpringMVCTrial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDAOConfig {

	@Bean
	public UserDAO dao()
	{
		return new UserDAOImpl();
	}
}
