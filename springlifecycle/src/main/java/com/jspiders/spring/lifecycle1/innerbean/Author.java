package com.jspiders.spring.lifecycle1.innerbean;

public class Author {

	String name;
	String email;
	long contact;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", contact=" + contact + "]";
	}

}
