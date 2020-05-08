package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.workshop.springdemo.beans.Country;
import com.workshop.springdemo.beans.Entitlement;
import com.workshop.springdemo.config.ImportResourceAppConfig;
import com.workshop.springdemo.config.IocApplicationConfiguration;

public class ClientImportResource {

	public static void main(String[] args) {
		//String[] files=new String[]{"javabasedconfig.xml"};
		/*ApplicationContext applicationContext=new AnnotationConfigApplicationContext(IocApplicationConfiguration.class);
		Country country=(Country)applicationContext.getBean("countryObj");
		System.out.println(country.getCountryName());*/
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(ImportResourceAppConfig.class);
		ctx.refresh();
		Entitlement ent= (Entitlement)ctx.getBean("entitlement");
	        System.out.println(ent.getName());		
	        System.out.println(ent.getTime());
	}

}
