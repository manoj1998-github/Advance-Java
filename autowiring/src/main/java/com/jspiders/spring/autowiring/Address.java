package com.jspiders.spring.autowiring;

public class Address {

	private int pincode;
	private String city;
	private String Street;

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + ", Street=" + Street + "]";
	}

}
