package com.jspiders.solidprincipals.srp;

public class Mainclass {

	public static void main(String[] args) {
		 
	Person person= new Person();
	person.setId(123);
	person.setName("manoj");
	person.setSalary(3000.23);
	
	PersonInsertDetails.save(person);

	}

}
