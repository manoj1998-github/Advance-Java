
package com.jspiders.SpringMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDAO // implementation class
{

	@Autowired
	private JdbcTemplate jdbcTemplate;// calling pre defined class for jdbc operations as referance variable

	@Override
	public void create() {

		String sql = "create database jspiders";
		int res = getJdbcTemplate().update(sql);
		System.out.println(res);
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
