package com.jspiders.spring.PlaneAOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Passenger {

	@Value("manoj")
	private String name;
	@Value("manoj@123")
	private String email;
	@Value("1234567")
	private long contact;
	@Value("23")
	private int age;
	@Value("Male")
	private String gender;
	@Autowired
	private Ticket ticket;
	
	public void ticketBooking()
	{
		System.out.println("your entered details is accepted and ticket is booking !!!");
	}
	public void paymentConfirm()
	{
		System.out.println("your payment is accepted and ticket is booking !!!");
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", email=" + email + ", contact=" + contact + ", age=" + age + ", gender="
				+ gender + ", ticket=" + ticket + "]";
	}

	

}
