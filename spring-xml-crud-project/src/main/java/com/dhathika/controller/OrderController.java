package com.dhathika.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.dhathika.dto.Order;
import com.dhathika.service.OrderService;

public class OrderController {
	
	
	
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("spring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Order order = (Order) beanFactory.getBean("order");
		OrderService service = (OrderService) beanFactory.getBean("orderService");
		System.out.println(service);
		service.saveOrder(order);
		
	}

}
