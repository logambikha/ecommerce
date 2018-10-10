package com.capgemini.orderapp.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.orderapp.entity.Order;
import com.capgemini.orderapp.repository.OrderRepository;
import com.capgemini.orderapp.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public List<Order> getOrders() {
		return orderRepository.findAll();
	}

	@Override
	public Order getOrder(int orderId) {
		Optional<Order> optionalOrder = orderRepository.findById(orderId);
		if(optionalOrder.isPresent()) { 
		return optionalOrder.get();}
		else
		{
			return null;
		}
	}

	@Override
	public void submitOrder(Order order) {
		
		orderRepository.save(order);
	}

	@Override
	public void updateOrder(Order order) {
		
	}

	@Override
	public void deleteOrder(int orderId) {
		orderRepository.deleteById(orderId);
	}

	@Override
	public void cancelOrder(int orderId) {
		Optional<Order> optionalOrder = orderRepository.findById(orderId);
		//System.out.println(orderId);
		if(optionalOrder.isPresent()) {
			Order order1 = optionalOrder.get();
			System.out.println(order1);
			order1.setOrderStatus(false);
			orderRepository.save(order1);
			//System.out.println(orderId);
		}
	}

}
