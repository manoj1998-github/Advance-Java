package com.jspiders.solidprincipals.srp;

public class PersonInsertDetails {

	
	public static void save(Person person)
	{
		System.out.println("person details saved with details " + person);
	}
}
    // for single responsible if person class is good but save method show error tester no need to check 
// again person class he can do changes in personInsertDetails so time saved