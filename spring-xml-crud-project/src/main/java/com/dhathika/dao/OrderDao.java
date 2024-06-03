package com.dhathika.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dhathika.dto.Order;
import com.dhathika.util.ConnectionUtil;

public class OrderDao {
	Order order = new Order();

	private ConnectionUtil util;

	public ConnectionUtil getUtil() {
		return util;
	}

	public void setUtil(ConnectionUtil util) {
		this.util = util;
	}

	public void saveOrderDao(Order order) {
		String insertQuery = "insert into order12 values (" + order.getOrderId() + "," + "'" + order.getOrderName() + "'"
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

	public Order selectOrderByOrderIdDao(int orderId) {
		String selectQuery = "select* from order12 where orderid=" + orderId;
		Connection con = null;
		Statement stmt = null;
		try {
			con = util.getConnection();
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(selectQuery);
			while (rs.next()) {
//				Order order1 = new Order();
				order.setOrderId(rs.getInt(1));
				order.setOrderName(rs.getString(2));
				order.setOrderPrice(rs.getDouble(3));
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return order;
	}

	public List<Order> selectAllOrderDao() {
		String selectQuery = "select* from order12 ";
		List<Order> orderList = new ArrayList<Order>();
		Connection con = null;
		Statement stmt = null;
		try {
			con = util.getConnection();
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(selectQuery);
			while (rs.next()) {
				Order order1 = new Order();
				order1.setOrderId(rs.getInt(1));
				order1.setOrderName(rs.getString(2));
				order1.setOrderPrice(rs.getDouble(3));
				orderList.add(order1);
			}
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return orderList;
	}

	public void deleteOrderDao(int orderId) {

		Connection con = null;
		Statement stmt = null;
		try {
			con = util.getConnection();
			stmt = con.createStatement();
			String deleteQuery = "delete from order12 where orderid=" + orderId;
			stmt.execute(deleteQuery);
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void updatOrderDao(Order order) {
		Connection con = null;
		Statement stmt = null;

		try {
			con = util.getConnection();
			stmt = con.createStatement();
			String updateorderQuery = "update order12 set ordername = " + "'" + order.getOrderName() + "',"
					+ "orderprice =" + order.getOrderPrice() + " where orderid = " + order.getOrderId();
			System.out.println(updateorderQuery);
			stmt.execute(updateorderQuery);
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
