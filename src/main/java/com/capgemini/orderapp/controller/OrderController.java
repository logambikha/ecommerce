package com.capgemini.orderapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.orderapp.entity.Order;
import com.capgemini.orderapp.service.OrderService;


@RestController
public class OrderController {
	
	//private HashMap<Integer, Set<LineItem>> cartItems;
	
	/*public OrderController() {
		cartItems = new HashMap<>();
	}
	*/
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/add")
	public ResponseEntity<Order> addOrder(@RequestBody Order order){
		orderService.submitOrder(order);
		return new ResponseEntity<Order>(order,HttpStatus.OK);	
	}
	
	@PostMapping("/cancel/{orderId}")
	public ResponseEntity<Order> cancelOrder(@PathVariable int orderId){
		System.out.println(orderId);
		orderService.cancelOrder(orderId);
		return new ResponseEntity<Order>(HttpStatus.OK);	
	}
	
}
