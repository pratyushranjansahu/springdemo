package com.workshop.springdemo.beans;

public class StaticFactoryTestBean {
	public static StaticFactoryTestBean staticFactoryTestBean;
	private StaticFactoryTestBean(){
		System.out.println("StaticFactoryTestBean private constructor");
	}
	
	public static StaticFactoryTestBean getInstance(){
		
		if(staticFactoryTestBean==null){
			staticFactoryTestBean=new StaticFactoryTestBean();
			return staticFactoryTestBean;
		}else
		return staticFactoryTestBean;
	}
	
}
