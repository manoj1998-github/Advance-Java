package com.jspiders.SpringBootUsedCase;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class SpringConfig {
	
	@Bean
	public SavingsAC createSavingsAC()
	{
		SavingsAC sac = new SavingsAC();
		return sac;
	}
	@Bean
	public CurrentAC createCurrentAC()
	{
		CurrentAC cac = new CurrentAC();
		return cac;
	}
	@Bean
	public Service createService()
	{
		Service sc = new Service();
		return sc;
	}
	

}
