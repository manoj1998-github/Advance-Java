package com.jspiders.spring.RealTimeEx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CurrentAccount implements Account {

	@Value("200")
	private double balance = 100;

	@Override
	public void setBalance(double balance) {
		this.balance=balance;
		
	}

	@Override
	public double gettBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public String toString() {
		return "CurrentAccount [balance=" + balance + "]";
	}

	
	
}
