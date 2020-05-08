package com.workshop.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.workshop.springdemo.beans.Country;

@Configuration
public class IocApplicationConfiguration {
	 @Bean(name="countryObj")
	 public Country getCountry()
	 {
	  return new Country("India");
	 }
}
