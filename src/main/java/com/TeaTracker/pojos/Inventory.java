package com.TeaTracker.pojos;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table(name= "inventory")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "itemId")
	private int itemId;
	
	@Column(name = "item_name")
	private String itemName;
	
	@Column(name = "quantity")
	private int quantity; 
	
	//change in db
	@Column( name = "tea_type")
	private String teaType;

	public Inventory(int itemId, String itemName, int quantity, String teaType) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.teaType = teaType;
	}
	
	
}
