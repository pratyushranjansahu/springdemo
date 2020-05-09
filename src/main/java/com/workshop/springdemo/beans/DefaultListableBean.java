package com.workshop.springdemo.beans;


public class DefaultListableBean {
	private String str;

	  public void setStr (String str) {
	      this.str = str;
	  }

	  public void doSomething () {
	      System.out.println("from DefaultListableBean " + str);
	  }
}

