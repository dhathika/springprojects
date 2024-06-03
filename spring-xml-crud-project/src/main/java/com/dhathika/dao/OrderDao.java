package com.dhathika.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.dhathika.dto.Order;
import com.dhathika.util.ConnectionUtil;

public class OrderDao {

	private ConnectionUtil util;
	
	

	public ConnectionUtil getUtil() {
		return util;
	}

	public void setUtil(ConnectionUtil util) {
		this.util = util;
	}

	public void saveOrderDao(Order order) {
		String insertQuery = "insert into order1 values (" + order.getOrderId() + "," + "'" + order.getOrderName() + "'"
				+ "," + order.getOrderPrice() + ")";
		Connection con = null;
		Statement stmt = null;
		try {
			con = util.getConnection();
			stmt = con.createStatement();
			stmt.execute(insertQuery);
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Order selectOrderByOrdeIdDao(int orderId) {

		return null;
	}

	public List<Order> selectAllOrderDao() {

		return null;
	}

	public void deleteOrderDao(int orderId) {

	}

	public void updatOrderDao(Order order) {

	}

}
