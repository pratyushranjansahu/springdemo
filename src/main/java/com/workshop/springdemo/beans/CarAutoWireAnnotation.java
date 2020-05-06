package com.workshop.springdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CarAutoWireAnnotation {
	private String name;
	@Autowired
	@Qualifier(value= "e1")
	private Engine engine;

	public String getName() {
		return name;
	}

	public CarAutoWireAnnotation() {
		System.out.println("CarAutoWireAnnotation default");
	}

	public void setName(String name) {
		this.name = name;
	}


	
	public void printDetails(){
		System.out.println("Car Name : "+name+" Engine detials : "+engine);
	}
}
