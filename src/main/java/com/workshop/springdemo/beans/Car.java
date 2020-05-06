package com.workshop.springdemo.beans;

public class Car {
	private String name;
	private Engine engine;

	public String getName() {
		return name;
	}

	public Car() {
		System.out.println("Car default");
	}

	public void setName(String name) {
		this.name = name;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
