package com.jspiders.spring.lifecycle1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean{

	int empno;
	String ename;
	double salary;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initializing ...bean");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("destroying ...bean");
		
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
