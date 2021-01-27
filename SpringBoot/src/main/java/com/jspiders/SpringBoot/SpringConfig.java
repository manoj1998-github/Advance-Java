package com.jspiders.SpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {

	@Bean(initMethod = "hii",destroyMethod = "bye")//life cycle method
	//@Scope("prototype")//for more object creation
	public Dao createDAO()
	{
		return new Dao();
	}
	
	@Bean
	public Service createService() {
		return new Service();
	}
}
