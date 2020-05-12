package com.workshop.springdemo.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;

import com.workshop.springdemo.beans.AutowiredCollectionBean;

public class CollectionConfig {
	@Bean
	public AutowiredCollectionBean getCollectionsBean() {
		return new AutowiredCollectionBean();
	}

	@Bean
	public List<String> nameList() {
		return Arrays.asList("John", "Adam", "Harry");
	}
}
