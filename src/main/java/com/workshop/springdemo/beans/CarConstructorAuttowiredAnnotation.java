package com.workshop.springdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class CarConstructorAuttowiredAnnotation {

	private Engine engine;
	@Autowired
	public CarConstructorAuttowiredAnnotation(Engine engine) {
		super();
		this.engine = engine;
	}
	public Engine getEngine() {
		return engine;
	}
	

	
	
}
