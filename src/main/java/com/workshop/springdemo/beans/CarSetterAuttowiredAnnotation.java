package com.workshop.springdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class CarSetterAuttowiredAnnotation {

	private Engine engine;

	public Engine getEngine() {
		return engine;
	}
	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
