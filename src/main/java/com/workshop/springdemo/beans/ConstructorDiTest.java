package com.workshop.springdemo.beans;

public class ConstructorDiTest {
private String name;
private int age;
private String email;
public ConstructorDiTest(String name, int age, String email) {
	super();
	this.name = name;
	this.age = age;
	this.email = email;
}
public void hello(){
	System.out.println("Hi your details is :");
	System.out.println("Name : "+name);
	System.out.println("Age : "+age);
	System.out.println("Mail : "+email);
}
	

}
