package com.TeaTracker.pojos;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table(name= "orders")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "orderId")
	private int orderId;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private int userId;
	
	@ManyToOne
	@JoinColumn(name = "itemId")
	@Column(name = "itemId")
	private int itemId;
	
	@Column(name = "quanitity")
	private int quantity;
	
	@Column(name = "total_cost")
	private double totalCost;

	public Order(int orderId, int userId, int itemId, int quantity, double totalCost) {
		this.orderId = orderId;
		this.userId = userId;
		this.itemId = itemId;
		this.quantity = quantity;
		this.totalCost = totalCost;
	}

	public Order() {
		super();
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	
	
}
