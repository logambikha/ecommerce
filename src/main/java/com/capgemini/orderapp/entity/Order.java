package com.capgemini.orderapp.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="Orders")
public class Order {
	
	@Id
	private int orderId;
	private double orderTotal;
	private LocalDate orderDate;
	private int customerId;
	private Set<LineItem> lineItem;
	private boolean orderStatus;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, double orderTotal, LocalDate orderDate, int customerId,
			Set<LineItem> lineItem, boolean orderStatus) {
		super();
		this.orderId = orderId;
		this.orderTotal = orderTotal;
		this.orderDate = orderDate;
		this.customerId = customerId;
		this.lineItem = lineItem;
		this.orderStatus = orderStatus;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Set<LineItem> getLineItem() {
		return lineItem;
	}
	public void setLineItem(Set<LineItem> lineItem) {
		lineItem = lineItem;
	}
	public boolean isOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(boolean orderStatus) {
		this.orderStatus = orderStatus;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderTotal=" + orderTotal + ", orderDate=" + orderDate + ", customerId="
				+ customerId + ", LineItem=" + lineItem + ", orderStatus=" + orderStatus + "]";
	}
	
	

}
