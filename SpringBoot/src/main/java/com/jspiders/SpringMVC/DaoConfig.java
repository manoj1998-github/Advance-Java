package com.jspiders.SpringMVC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* 
 * its good practice to create configuration classes for coder convention 
 * Separating implementation classes to create bean object using '@Bean' annotation
 */

@Configuration
public class DaoConfig  
{
	@Bean
	public UserDAO dao() {
		return new UserDaoImpl();
	}

}
