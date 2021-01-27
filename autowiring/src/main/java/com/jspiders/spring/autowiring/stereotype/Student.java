package com.jspiders.spring.autowiring.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component or for reference bean name 
@Component("std")
@Scope("prototype") // or singleton create only one object,prototype create object how many times
					// springcore create the object
public class Student {

	@Value("101")
	private int regno;
	@Value("manoj")
	private String name;
	@Value("#{subjects_names}") // spring expression
	private List<String> subjects;
	@Autowired
	private Trainer trainer;

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return "Student [regno=" + regno + ", name=" + name + ", subjects=" + subjects + ", trainer=" + trainer + "]";
	}

}
