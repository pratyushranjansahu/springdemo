package com.workshop.springdemo.beans;

public class BeanFactoryPostProcessorbean {
	 private String strProp;
	 public void setStrProp (String strProp) {
         this.strProp = strProp;
     }

     public void doSomething () {
         System.out.println("from BeanFactoryPostProcessorbean:  " + strProp);
     }
}
