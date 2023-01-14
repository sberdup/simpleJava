package com.it.berdeja.oop.store;

public interface OrderManagementService {
	void addOrder(Order order);

	Order[] getOrdersByUserId(int userId);
	
	Order[] getOrders();
}
