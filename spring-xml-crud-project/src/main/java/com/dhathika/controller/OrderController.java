package com.dhathika.controller;

import java.util.List;

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
		service.saveOrder(order);
		
//		Order orderById =service.selectOrderByOrderId(10067);
//		System.out.println(orderById);
	
		List<Order> orderList=	service.selectAllOrder();
		for(Order or:orderList)
		System.out.println(or);
		
//		service.deleteOrder(19056);
		
//		Order updatedorder = service.selectOrderByOrderId(19056);
//		updatedorder.setOrderName("Bags");
//		updatedorder.setOrderPrice(1000);
//		service.updatOrder(updatedorder);
	}

}
