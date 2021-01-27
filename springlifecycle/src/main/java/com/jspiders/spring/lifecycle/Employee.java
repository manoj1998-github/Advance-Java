package com.jspiders.spring.lifecycle;

import org.springframework.beans.factory.annotation.Required;

public class Employee {

	int empno;
	String ename;
	double salary;
	
	public void init()// any method name hii()
	{
		System.out.println("initializing.....bean");
	}
	
	public void destroy()//bii()
	{
		System.out.println(" destroy ...bean");
	}

	
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	@Required
	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", salary=" + salary + "]";
	}

}
