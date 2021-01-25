package com.TeaTracker.dto;

import com.TeaTracker.pojos.Inventory;

public class InventoryDto implements Dto<Inventory>{
	
	private int itemId;
	
	private String itenName;
	
	private int quantity;
	
	private String teaType;
	
	public InventoryDto() {
		super();
	}
	
	

	public InventoryDto(int itemId, String itenName, int quantity, String teaType) {
		super();
		this.itemId = itemId;
		this.itenName = itenName;
		this.quantity = quantity;
		this.teaType = teaType;
	}





	@Override
	public Inventory toPojo() {
		// TODO Auto-generated method stub
		return null;
	}

}
