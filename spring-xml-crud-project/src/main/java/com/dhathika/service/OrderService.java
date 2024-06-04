package com.dhathika.service;

import java.util.ArrayList;
import java.util.List;

import com.dhathika.dao.OrderDao;
import com.dhathika.dto.Order;

public class OrderService {
	
	 OrderDao orderDao;
	 
	


	public OrderService(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

//	public OrderDao getOrderDao() {
//		return orderDao;
//	}
//
//	public void setOrderDao(OrderDao orderDao) {
//		this.orderDao = orderDao;
//	}

	public void saveOrder(Order order) {
		orderDao.saveOrderDao(order);
	}
	
	public Order selectOrderByOrderId(int orderId) {
		Order orderById =orderDao.selectOrderByOrderIdDao(orderId);
		return orderById;
	}
	
	public List<Order> selectAllOrder(){
		List<Order> orderList=orderDao.selectAllOrderDao();
		return orderList;
	}
	
	public void deleteOrder(int orderId) {
		orderDao.deleteOrderDao(orderId);
	}
	public void updatOrder(Order order) {
		orderDao.updatOrderDao(order);
	}

}
