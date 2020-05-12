package com.workshop.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.workshop.springdemo.BeanFactoryPostProcessorImpl;

@Configuration
public class BeanFactoryPostProcessorConfig {
	 @Bean
	 BeanFactoryPostProcessorImpl myConfigBean () {
         return new BeanFactoryPostProcessorImpl();
     }
}
