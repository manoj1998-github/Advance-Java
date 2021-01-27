package com.jspiders.constructorinjection.properties;

public class MyDatabase {

	private String dbname;
	private String dbUsername;
	private String dbPassword;

	public MyDatabase(String dbname, String dbUsername, String dbPassword) {
		super();
		this.dbname = dbname;
		this.dbUsername = dbUsername;
		this.dbPassword = dbPassword;
	}

	public String getDbname() {
		return dbname;
	}

	public void setDbname(String dbname) {
		this.dbname = dbname;
	}

	public String getDbUsername() {
		return dbUsername;
	}

	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	@Override
	public String toString() {
		return "MyDatabase [dbname=" + dbname + ", dbUsername=" + dbUsername + ", dbPassword=" + dbPassword + "]";
	}

}
