package com.jspiders.constructorinjection.hospitalmanagementsystem;

public class Hospital {

	private String name;
	private String location;
	private Doctor doctor;
	private Patient patient;

	public Hospital(String name, String location, Doctor doctor, Patient patient) {
		super();
		this.name = name;
		this.location = location;
		this.doctor = doctor;
		this.patient = patient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", location=" + location + ", doctor=" + doctor + ", patient=" + patient
				+ "]";
	}

	
}
