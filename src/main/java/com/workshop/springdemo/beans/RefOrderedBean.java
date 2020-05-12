package com.workshop.springdemo.beans;

public class RefOrderedBean implements RefBeanService {
    @Override
	public String toString() {
		return "RefOrderedBean [str=" + str + "]";
	}

	private String str;

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		return null;
	}

}
