package com.workshop.springdemo.beans;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;

public class CarConstructorAuttowiredAnnotation {

	private Engine engine;
	//@Autowired
	@Inject
	public CarConstructorAuttowiredAnnotation(Engine engine) {
		super();
		this.engine = engine;
	}
	public Engine getEngine() {
		return engine;
	}
	

	
	
}
