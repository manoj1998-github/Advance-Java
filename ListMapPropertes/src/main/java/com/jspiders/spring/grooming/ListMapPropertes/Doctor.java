package com.jspiders.spring.grooming.ListMapPropertes;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Doctor {

	@Value("#{equipments_name}")
	private List<String> equipments;
	@Value("#{names}")
	private Map<Integer, String> names;
	@Value("${}")
	private Properties statesandlanguage;

	public List<String> getEquipments() {
		return equipments;
	}

	public void setEquipments(List<String> equipments) {
		this.equipments = equipments;
	}

	public Map<Integer, String> getNames() {
		return names;
	}

	public void setNames(Map<Integer, String> names) {
		this.names = names;
	}

	public Properties getStatesandlanguage() {
		return statesandlanguage;
	}

	public void setStatesandlanguage(Properties statesandlanguage) {
		this.statesandlanguage = statesandlanguage;
	}

	@Override
	public String toString() {
		return "Doctor [equipments=" + equipments + ", names=" + names + ", statesandlanguage=" + statesandlanguage
				+ "]";
	}

}
