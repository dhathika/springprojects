package com.dhathika.pojo;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws IOException {
		// creating a student object in core java simplest way
//	Student std = new Student();
//	System.out.println(std.hashCode()); // 1712
//	        std = new Student();
//	        System.out.println(std.hashCode());     // 
//	      std = new Student();
//	      System.out.println(std.hashCode());
// prototype design pattern 
// for each request a new object. 
		

		
		
		ApplicationContext  context = new ClassPathXmlApplicationContext("spring.xml");
      
        Student std = (Student) context.getBean("student");
        System.out.println(std);
      

// spring is by deafult follows singleton design pattern . 
// for all the requests we get same object. or same single object. 
// what is the default design pattern spring fallows.
// single design pattern is a creational design pattern. 
// prototype design pattern is a creational design pattern. 
// builder design pattern is a creational design pattern 
// factory design pattern is a creatinal design pattern
// abstractfactory design pattern is a creational design pattern 
		
		
	}

}
