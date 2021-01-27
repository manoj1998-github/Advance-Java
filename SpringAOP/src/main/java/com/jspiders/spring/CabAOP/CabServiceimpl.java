package com.jspiders.spring.CabAOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CabServiceimpl implements CabService {

	@Autowired
	private Cab cab;

	public Cab getCab() {
		return cab;
	}

	public void setCab(Cab cab) {
		this.cab = cab;
	}

	@Override
	public void bookCab() {
		System.out.println("cab is booked vd name = "+ cab.getName() +" and with id ="+ cab.getId());
		
	}

	@Override
	public double payment() {
		System.out.println("you are doing the payment");
		return 17.23;
		
	}

}
