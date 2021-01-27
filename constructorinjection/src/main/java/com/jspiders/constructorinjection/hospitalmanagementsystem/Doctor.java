package com.jspiders.constructorinjection.hospitalmanagementsystem;

public class Doctor {

	private int id;
	private String name;
	private String specializaion;
	private Patient patient;

	public Doctor(int id, String name, String specializaion, Patient patient) {
		super();
		this.id = id;
		this.name = name;
		this.specializaion = specializaion;
		this.patient = patient;
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

	public String getSpecializaion() {
		return specializaion;
	}

	public void setSpecializaion(String specializaion) {
		this.specializaion = specializaion;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", specializaion=" + specializaion + ", patient=" + patient
				+ "]";
	}

	
}
