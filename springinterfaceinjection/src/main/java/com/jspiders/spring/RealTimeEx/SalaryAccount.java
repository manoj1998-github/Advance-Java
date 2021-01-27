package com.jspiders.spring.RealTimeEx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SalaryAccount implements Account {

	@Value("250")
	private double balance = 100;

	@Override
	public void setBalance(double balance) {
		this.balance=balance;
	}

	@Override
	public double gettBalance() {

		return balance;
	}

	@Override
	public String toString() {
		return "SalaryAccount [balance=" + balance + "]";
	}

	
}
