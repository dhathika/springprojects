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
		
//		Order orderById =service.selectOrderByOrderId(1012);
//		System.out.println(orderById);
		
//		List<Order> orderList=	service.selectAllOrder();
//		for(Order or:orderList)
//		System.out.println(or);
		
//		service.deleteOrder(1012);
		
//		Order updatedorder = service.selectOrderByOrderId(1011);
//		updatedorder.setOrderName("laptop");
//		updatedorder.setOrderPrice(60000);
//		service.updatOrder(updatedorder);
	}

}
