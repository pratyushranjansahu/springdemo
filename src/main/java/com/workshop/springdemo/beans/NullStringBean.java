package com.workshop.springdemo.beans;

public class NullStringBean {
private String email;

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "NullStringBean [email=" + email + "]";
}
}
