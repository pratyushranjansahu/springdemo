package com.workshop.springdemo.beans;

public class AbstractCustomer {
	private int type;
	private String action;
	private String Country;
	public int getType() {
		return type;
	}
	@Override
	public String toString() {
		return "AbstractCustomer [type=" + type + ", action=" + action + ", Country=" + Country + "]";
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
}
