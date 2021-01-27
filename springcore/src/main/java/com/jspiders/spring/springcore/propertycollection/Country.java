package com.jspiders.spring.springcore.propertycollection;

import java.util.Properties;

public class Country {

	String name;
	Properties statesandlanguages; // same as map bur multiple key allowed, generics not allowed

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Properties getStatesandlanguages() {
		return statesandlanguages;
	}

	public void setStatesandlanguages(Properties statesandlanguages) {
		this.statesandlanguages = statesandlanguages;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", statesandlanguages=" + statesandlanguages + "]";
	}

}
