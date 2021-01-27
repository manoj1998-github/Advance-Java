package com.jspiders.SpringMVC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/*
 * since we create object for SpringConfig in test class
 * we have to import other config class to this class using '@Import' annotation
 * if there is multiple config class then import statement will be 
 * '@Import({DaoConfig.class,BeamConfig.class})'
 */
@Configuration
@Import(DaoConfig.class)   // for multiple implementation classes  to be configure classes use Springexpressionlang({DaoConfig.class,BeamConfig.class})'
public class SpringConfig {

	@Bean
	public Service createService() {
		return new Service();
	}

	@Bean
	public DriverManagerDataSource dataSource() {

		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306");
		dmds.setUsername("root");
		dmds.setPassword("root");
		return dmds;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());

		return jdbcTemplate;
	}

}
