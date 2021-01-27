package com.jspiders.SpringMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * calling classes as reference type since objects are created in respective 
 * configuration classes(DaoConfig.java).
 */

@Component
public class Service {
	@Autowired
	private UserDAO dao;

	public UserDAO getDao() {
		return dao;
	}

	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

}
