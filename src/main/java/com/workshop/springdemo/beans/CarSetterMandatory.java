package com.workshop.springdemo.beans;

public class CarSetterMandatory {
	private String name;
	private Engine engine;
	public String getName() {
		return name;
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
	
	public void printData(){
		System.out.println("Car name : "+name+" Engine Details : "+engine);
	}
	
}
