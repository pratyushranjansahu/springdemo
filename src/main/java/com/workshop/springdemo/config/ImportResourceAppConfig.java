package com.workshop.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.workshop.springdemo.beans.Entitlement;

@Configuration
@ImportResource("classpath:/importresource.xml")
public class ImportResourceAppConfig {
	
	
}
