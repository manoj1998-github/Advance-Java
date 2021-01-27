package com.jspiders.spring.autowiring.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Entity {
	
	@Value("#{10>5}")
	private boolean bool;
	
	@Value("#{T(Math).abs(-10)}")//@Value("#{T(java.lang.Math).abs(-10)}")//T is generics 
	private int num;                     //("#{T(new Integer(100))}")

	
	public boolean isBool() {
		return bool;
	}                                     

	public void setBool(boolean bool) {
		this.bool = bool;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Entity [bool=" + bool + ", num=" + num + "]";
	}
	
	
	

}
