package com.dhathika.main;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dhathika.beans.AppConfig;
import com.dhathika.beans.Customer;
import com.dhathika.beans.Landmark;

public class MainClass {
	
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("bibinspring.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(context);
     Customer customer =  (Customer) context.getBean("customer");
      System.out.println(customer.getCustomerAddress());

	}

}
