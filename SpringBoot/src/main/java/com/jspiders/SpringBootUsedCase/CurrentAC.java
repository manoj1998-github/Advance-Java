package com.jspiders.SpringBootUsedCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CurrentAC implements Account {

	@Value("100.24")
	private double bal;

	@Override
	public void setbal(double bal) {
		this.bal = bal;

	}

	@Override
	public double getbal() {
		return bal;
	}

}
