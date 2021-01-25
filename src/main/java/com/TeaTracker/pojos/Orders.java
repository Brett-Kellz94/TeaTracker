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
public class Orders {

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

	public Orders(int orderId, int userId, int itemId, int quantity, double totalCost) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.itemId = itemId;
		this.quantity = quantity;
		this.totalCost = totalCost;
	}
	
	
}
