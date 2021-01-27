package com.jspiders.spring.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private int empno;
	private String ename;
	@Autowired
	private Address address;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", address=" + address + "]";
	}

}
