package com.jspiders.spring.CabAOP;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cab {

	@Value("101")
	private int id;
	@Value("ola")
	private String name;
	@Value("mini-type")
	private String type;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Cab [id=" + id + ", name=" + name + ", type=" + type + "]";
	}

}
