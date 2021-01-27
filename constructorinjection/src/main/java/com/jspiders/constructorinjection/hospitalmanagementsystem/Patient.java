package com.jspiders.constructorinjection.hospitalmanagementsystem;

public class Patient {

	private int id;
	private String name;
	private int age;
	private String gender;
	private long contact;
	private String disease;

	public Patient(int id, String name, int age, String gender, long contact, String disease) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.contact = contact;
		this.disease = disease;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", contact=" + contact
				+ ", disease=" + disease + "]";
	}

	
}
