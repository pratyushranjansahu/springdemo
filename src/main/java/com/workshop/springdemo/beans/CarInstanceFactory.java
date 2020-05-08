package com.workshop.springdemo.beans;

public class CarInstanceFactory {
private String carName;

public String getCarName() {
	return carName;
}

public void setCarName(String carName) {
	this.carName = carName;
}

public CarInstance getInstance() throws Exception{
	CarInstance carInstance=(CarInstance)Class.forName(carName).newInstance();
	return carInstance;
}
}
