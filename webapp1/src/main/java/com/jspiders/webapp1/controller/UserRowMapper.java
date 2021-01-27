package com.jspiders.webapp1.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class UserRowMapper implements RowMapper<User>

{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException
	{
	User user = new User();
	
	user.setId(rs.getInt("id"));//setID(rs.getInt("ID"));
	user.setName(rs.getString("Name"));
	user.setEmail(rs.getString("Email"));
	user.setPassword(rs.getInt("password"));//setPassword(rs.getString("Password"));
	
	return user;
	
		
	}
	
}
