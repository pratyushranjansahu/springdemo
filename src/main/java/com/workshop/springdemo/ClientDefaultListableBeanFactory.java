package com.workshop.springdemo;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import com.workshop.springdemo.beans.DefaultListableBean;

/*https://www.logicbig.com/tutorials/spring-framework/spring-core/bean-definition.html*/
public class ClientDefaultListableBeanFactory {

	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory =
                new DefaultListableBeanFactory();

      BeanDefinitionBuilder b =
                BeanDefinitionBuilder.rootBeanDefinition(DefaultListableBean.class)
                                     .addPropertyValue("str", "myStringValue");

      beanFactory.registerBeanDefinition("myBean", b.getBeanDefinition());


      DefaultListableBean bean = beanFactory.getBean(DefaultListableBean.class);
      bean.doSomething();


	}

}
