package com.workshop.springdemo.beans;

import java.util.List;

public class CollectionMergingBean {
	private String user;
    private List < String > items;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public List<String> getItems() {
		return items;
	}
	@Override
	public String toString() {
		return "CollectionMergingBean [user=" + user + ", items=" + items + "]";
	}
	public void setItems(List<String> items) {
		this.items = items;
	}
    
}
