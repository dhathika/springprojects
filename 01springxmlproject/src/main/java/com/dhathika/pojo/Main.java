package com.dhathika.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// creating a student object in core java simplest way
//	Student std = new Student();
//	System.out.println(std);
//	std.setSid(1010);
//	std.setName("vishnupriya");
//	std.setMarks(90.8);
//	Address address = new Address();
//	address.setDno(1);
//	address.setStreet("Bhagath Street");
//	address.setCity("Tirupathi");
//	address.setState("A.P");
//	address.setPin(515571);
//	std.setAddress(address);
//   System.out.println(std);
		
		ApplicationContext  context = new ClassPathXmlApplicationContext("spring.xml");
		Student std = (Student) context.getBean("std2");
		System.out.println(std);
	}

}
