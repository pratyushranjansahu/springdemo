package com.workshop.springdemo.beans;

public class AudiInstance implements CarInstance {

	@Override
	public void drive() {
		System.out.println("Audi Drive fast");
		
	}

}
