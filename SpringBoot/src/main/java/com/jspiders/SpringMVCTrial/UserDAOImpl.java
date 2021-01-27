
package com.jspiders.SpringMVCTrial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	/*@Override
	public void create() {

		String query = " create database jspiders15";
		int cr = jdbctemplate.update(query);
		System.out.println("database created :" + cr);
		
	}
	
	@Override
	public int useDatabase() {
		String query = "use jspiders15";
		int ud = jdbctemplate.update(query);
		
		return ud;
		
	}*/
	
	public int insert(Student student)
	{
		String query = "insert into Regform values(?,?,?)";
		int in = jdbctemplate.update(query, student.getId(),student.getName(),student.getMail());
		return in;
		
	}

	
	

	

}
