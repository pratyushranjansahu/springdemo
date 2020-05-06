package com.workshop.springdemo.beans;

public class CarDependsOn {
	private String name;
	private Engine engine;
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public CarDependsOn(){
		System.out.println("Car called after Engine");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
