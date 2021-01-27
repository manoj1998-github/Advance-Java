package com.jspiders.SpringBootUsedCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Service {

	@Autowired
	private CurrentAC currentac;
	@Autowired
	private SavingsAC savingsac;

	public CurrentAC getCurrentac() {
		return currentac;
	}

	public void setCurrentac(CurrentAC currentac) {
		this.currentac = currentac;
	}

	public SavingsAC getSavingsac() {
		return savingsac;
	}

	public void setSavingsac(SavingsAC savingsac) {
		this.savingsac = savingsac;
	}

	@Override
	public String toString() {
		return "Service [currentac=" + currentac + ", savingsac=" + savingsac + "]";
	}
	
	
	
	
}
