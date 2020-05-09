package com.workshop.springdemo.beans;

public class OuterBean {
	static int data=30; 
	public  static class Inner{  
		  public  void msg(){System.out.println("data is "+data);}  
		  } 
}
