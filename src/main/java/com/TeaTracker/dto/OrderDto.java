package com.TeaTracker.dto;

import com.TeaTracker.pojos.Order;

public class OrderDto implements Dto<Order>{

	private int orderId;
	
	private int userId;
	
	private int itemId;
	
	private int quantity;
	
	private double cost;
	
	public OrderDto(int orderId, int userId, int itemId, int quantity, double cost) {
		this.orderId = orderId;
		this.userId = userId;
		this.itemId = itemId;
		this.quantity = quantity;
		this.cost = cost;
	}

    public OrderDto(Order order) {
    	this.orderId = order.getOrderId();
    	this.userId = order.getUserId();
    	this.itemId = order.getItemId();
    	this.quantity = order.getQuantity();
    	this.cost = order.getTotalCost();
    }
    

	@Override
	public Order toPojo() {
		Order order = new Order();
		order.setOrderId(this.getOrderId());
		order.setItemId(this.getItemId());
		order.setUserId(this.getUserId());
		order.setQuantity(this.getQuantity());
		order.setTotalCost(this.getCost());
		return order;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	   @Override
		 public String toString() {
		       return "OrderDto [itemId=" + itemId + ", orderId=" + orderId + ", userId=" + userId + ", quantity="
		               + quantity + ",  cost=" + cost +"]";
		    }
}
