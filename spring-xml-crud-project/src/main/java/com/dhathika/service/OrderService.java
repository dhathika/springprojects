package com.dhathika.service;

import java.util.List;

import com.dhathika.dao.OrderDao;
import com.dhathika.dto.Order;

public class OrderService {
	
	 OrderDao orderDao;
	 
	


	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	public void saveOrder(Order order) {
		orderDao.saveOrderDao(order);
	}
	
	public Order selectOrderByOrdeId(int orderId) {
		
		return null;
	}
	
	public List<Order> selectAllOrder(){
		
		return null;
	}
	
	public void deleteOrder(int orderId) {
		
	}
	public void updatOrder(Order order) {
		
	}

}
