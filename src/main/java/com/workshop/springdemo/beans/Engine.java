package com.workshop.springdemo.beans;

public class Engine {

	public Engine() {
		System.out.println("Engine default");
	}

	private String modelYear;

	@Override
	public String toString() {
		return "Engine [modelYear=" + modelYear + "]";
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

}
