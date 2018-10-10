package com.capgemini.orderapp.entity;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Items")
public class LineItem {
	
	private int lineItemId;
	private int lineItemQuantity;
	private int productId;
	public LineItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LineItem(int lineItemId, int lineItemQuantity, int productId) {
		super();
		this.lineItemQuantity = lineItemQuantity;
		this.productId = productId;
	}
	public int getLineItemQuantity() {
		return lineItemQuantity;
	}
	public void setLineItemQuantity(int lineItemQuantity) {
		this.lineItemQuantity = lineItemQuantity;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "LineItem [lineItemQuantity=" + lineItemQuantity + ", productId=" + productId + "]";
	}
	public int getLineItemId() {
		return lineItemId;
	}
	public void setLineItemId(int lineItemId) {
		this.lineItemId = lineItemId;
	}
	
	

}
