package com.capgemini.orderapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.orderapp.entity.Order;


@Service
public interface OrderService {
	public List<Order> getOrders();
	
    public Order getOrder(int orderId);

	public void submitOrder(Order order);
	
	public void updateOrder(Order order);
	
	public void deleteOrder(int orderId);
	
	public void cancelOrder(int orderId);
	

}
