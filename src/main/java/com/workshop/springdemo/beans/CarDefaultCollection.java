package com.workshop.springdemo.beans;

import java.util.List;
import java.util.Set;

public class CarDefaultCollection {
	private List<String> names;
	private Set<Engine> engines;
	
	
	public List<String> getNames() {
		return names;
	}


	public void setNames(List<String> names) {
		this.names = names;
	}


	public Set<Engine> getEngines() {
		return engines;
	}


	public void setEngines(Set<Engine> engines) {
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
