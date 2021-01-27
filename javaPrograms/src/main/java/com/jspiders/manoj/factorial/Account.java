package com.jspiders.manoj.factorial;

public class Account {

	private double bal;

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		if (bal > 0) {
			this.bal = bal;
			System.out.println(bal);
		}
		else
		{
			System.out.println("invalid bal");
		}

	}

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.getBal();
		a1.setBal(203.45);
		a1.getBal();
		
		
		

	}

}
