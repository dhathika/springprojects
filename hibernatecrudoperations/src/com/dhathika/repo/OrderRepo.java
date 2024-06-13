package com.dhathika.repo;

import java.util.List;

import com.dhathika.dto.Order;

public interface OrderRepo {
	public void saveOrderRepo(Order order);
	public Order selectOrderByIdRepo(int orderId);
	public List<Order> selectAllOrdersRepo();
	public void deleteOrderByIdRepo(int orderId);
	public Order updateOrderRepo(Order order);
	public List<Order> selectOrdersByPriceRepo();
	public Order testLoad(int orderId);
	public Order testGet(int orderId);
}
