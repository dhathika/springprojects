package com.dhathika.service;

import java.util.List;

import com.dhathika.dto.Order;
import com.dhathika.repo.OrderRepo;
import com.dhathika.repo.OrderRepoImpl;

public class OrderServiceImpl implements OrderService{
	
	// you do apply some business logic. 
	
	OrderRepo repo = new OrderRepoImpl();
	

	@Override
	public void saveOrder(Order order) {
		repo.saveOrderRepo(order);
		
	}

	@Override
	public Order selectOrderById(int orderId) {
		Order order = repo.selectOrderByIdRepo(orderId);
		return order;
	}

	@Override
	public List<Order> selectAllOrders() {
	List<Order> orderList =	repo.selectAllOrdersRepo();
		return orderList;
	}

	@Override
	public void deleteOrderById(int orderId) {
	     repo.deleteOrderByIdRepo(orderId);
		
	}

	@Override
	public Order updateOrder(Order order) {
		Order order1 = repo.updateOrderRepo(order);
		return order1;
	}

	@Override
	public List<Order> selectOrderByPriceCondition() {
	    List<Order> orderList =   repo.selectOrdersByPriceRepo();
		return orderList;
	}

	@Override
	public Order testLoad(int orderId) {
		
		return repo.testLoad(orderId);
	}

	@Override
	public Order testGet(int orderId) {
		// TODO Auto-generated method stub
		return repo.testGet(orderId);
	}

}
