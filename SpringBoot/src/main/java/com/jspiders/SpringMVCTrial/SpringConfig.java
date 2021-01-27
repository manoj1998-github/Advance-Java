package com.jspiders.SpringMVCTrial;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.jspiders.SpringBootUsedCase.Service;


@Configuration
@Import(UserDAOConfig.class)
public class SpringConfig {

	@Bean
	public ServiceConfig createService()
	{
		return new ServiceConfig();
	}
	
	@Bean
	public DriverManagerDataSource datasource()
	{
		DriverManagerDataSource  dm = new DriverManagerDataSource(); 
		dm.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dm.setUrl("jdbc:mysql://localhost:3306/jspiders");
		dm.setUsername("root");
		dm.setPassword("root");
		return dm;
	}
	@Bean
	public JdbcTemplate jdbc()
	{
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(datasource());
		return jt;
	}
	
	@Bean
	public Student createStudent()
	{
		Student st = new Student();
		st.setId(103);
		st.setName("Dheeraj");
		st.setMail("Dheeraj@1998");
		return st;
	}
	
}
