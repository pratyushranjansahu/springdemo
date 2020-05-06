package com.workshop.springdemo.beans;

public class CarCollection {
	private String[] names;
	private Engine[] engines;
	public String[] getNames() {
		return names;
	}
	public void setNames(String[] names) {
		this.names = names;
	}
	public Engine[] getEngines() {
		return engines;
	}
	public void setEngines(Engine[] engines) {
		this.engines = engines;
	}
	
	public void printData(){
		System.out.println("Car names ");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("*****************");
		System.out.println("Engine Details");
		for (Engine engine : engines) {
			System.out.println(engine);
		}
	}
	
}
