package com.jspiders.spring.autowiring.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Trainer {

	@Value("manoj@98")
	private String email;
	@Value("manoj kumar cn")
	private String name;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Trainer [email=" + email + ", name=" + name + "]";
	}
	
	
}
