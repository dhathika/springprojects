package com.rohan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rohan.beans.AppConfig;
import com.rohan.beans.Customer;

public class MainClass {

	
		
		public static void main(String[] args) {
//			ApplicationContext context = new ClassPathXmlApplicationContext("bibinspring.xml");
			ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			System.out.println(context);
	     Customer customer =  (Customer) context.getBean("customer");
	      System.out.println(customer.getCustomerAddress());
		

	}

}
