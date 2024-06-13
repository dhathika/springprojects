package com.dhathika.repo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.dhathika.dto.Order;
import com.dhathika.util.SessionUtil;

public class OrderRepoImpl implements OrderRepo{

	@Override
	public void saveOrderRepo(Order order) {
	
		Session session = SessionUtil.getSession();
		Transaction txt = session.beginTransaction();
		session.save(order);
		// order object is persisted. 
		// order object went into persistant state. 
		txt.commit();
		session.close();
		
	}

	@Override
	public Order selectOrderByIdRepo(int orderId) {
		Session session = SessionUtil.getSession();
		Transaction txt = session.beginTransaction();
		
		Order order = session.get(Order.class,orderId);
		order.setOrderType("electornics");
		session.save(order);
		txt.commit();
		return order;
	}

	@Override
	public List<Order> selectAllOrdersRepo() {
		// TODO Auto-generated method stub
		// select * from OrderTable;
		// it is deprecated. it works but no more support on the method
		// it will be removed from the future versions of java
		Session session = SessionUtil.getSession();
		Query<Order> query = session.createQuery("from Order");
		
		List<Order> orderList = query.list();
		return orderList;
	}

	@Override
	public void deleteOrderByIdRepo(int orderId) {
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		Order order = new Order();
		order.setOrderId(orderId);
		session.delete(order);
		tx.commit();
		
	}

	@Override
	public Order updateOrderRepo(Order order) {
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.update(order);
		Order updateOrderRecordFromDB = session.get(Order.class, order.getOrderId());
		return updateOrderRecordFromDB;
	}

	@Override
	public List<Order> selectOrdersByPriceRepo() {
		// new concept Criteria. 
		// Criteria  condition 
		// criterion = one/single condition
		// criteria = multiple criterions. 
		Session session = SessionUtil.getSession();
		Criteria criteria = session.createCriteria(Order.class);
		Criterion condition1 = Restrictions.gt("orderPrice", 5000.0);
		Criterion condition2 = Restrictions.lt("orderPrice", 500.0);
		Criterion condition3  = Restrictions.eq("orderType", "food");
		Criterion and = Restrictions.and(condition1,condition2);
		Criterion or = Restrictions.or(and,condition3);
		criteria.add(or);
	List<Order> orderList = criteria.list();
		return orderList;
	}

	@Override
	public Order testLoad(int orderId) {
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		Order loadOrder = session.load(Order.class, new Integer(orderId));
		System.out.println(loadOrder);
		tx.commit();
		return loadOrder;
	}

	@Override
	public Order testGet(int orderId) {
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		Order getOrder = session.get(Order.class, new Integer(orderId));
		tx.commit();
		System.out.println(getOrder);
		return getOrder;
		
	}
	
	public void executeHQLQuery() {
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
//		Query<Order> updateQuery = session.
//				createQuery("update Order set orderPrice = 700,orderType = 'bevarages' where orderId = 1");
//		updateQuery.executeUpdate();
//	tx.commit();
		
//		Query<Order> selectQuery = session.createQuery("from Order");
//		List<Order> orderList = selectQuery.getResultList();
//		Order dummyOrder = null;
//		double maxPrice = 0;
//		for(Order ord : orderList) {
//			
//			if(maxPrice < ord.getOrderPrice())
//				dummyOrder = ord;
//		}
//		System.out.println(dummyOrder);
		
		Query<Order> q = session.createQuery("from Order order by orderPrice asc");
			System.out.println();
		List<Order> result = q.getResultList();
		System.out.println(result.get(0));
	 
	SessionUtil.closeSession(session);
	}
	
	public static void main(String[] args) {
		OrderRepoImpl obj = new OrderRepoImpl();
		obj.executeHQLQuery();
	}

}
