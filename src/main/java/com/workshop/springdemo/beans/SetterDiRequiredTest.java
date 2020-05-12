package com.workshop.springdemo.beans;

import org.springframework.beans.factory.annotation.Required;

public class SetterDiRequiredTest {
	private String gender;

	public String getGender() {
		return gender;
	}
	@Required
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void hello(String name){
		System.out.println("Hello : "+gender+ name );
	}
}
