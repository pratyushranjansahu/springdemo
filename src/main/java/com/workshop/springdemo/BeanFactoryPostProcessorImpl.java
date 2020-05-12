package com.workshop.springdemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

import com.workshop.springdemo.beans.BeanFactoryPostProcessorbean;

public class BeanFactoryPostProcessorImpl implements BeanFactoryPostProcessor {
	@Override
    public void postProcessBeanFactory (
              ConfigurableListableBeanFactory beanFactory)
              throws BeansException {

        GenericBeanDefinition bd = new GenericBeanDefinition();
        bd.setBeanClass(BeanFactoryPostProcessorbean.class);
        bd.getPropertyValues().add("strProp", "my string property");

        ((DefaultListableBeanFactory) beanFactory)
                  .registerBeanDefinition("myBeanName", bd);
    }
}
