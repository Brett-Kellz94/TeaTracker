package com.TeaTracker.dto;

import com.TeaTracker.pojos.Inventory;

public class InventoryDto implements Dto<Inventory>{
	
	private int itemId;
	
	private String itemName;
	
	private int quantity;
	
	private String teaType;
	
	public InventoryDto() {
		super();
	}
	

	public InventoryDto(int itemId, String itemName, int quantity, String teaType) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.teaType = teaType;
	}

   public InventoryDto(Inventory item) {
	   this.itemId = item.getItemId();
	   this.itemName = item.getItemName();
	   this.quantity = item.getQuantity();
	   this.teaType = item.getTeaType();
   }


	@Override
	public Inventory toPojo() {
		Inventory item = new Inventory();
		item.setItemId(this.getItemId());
		item.setItemName(this.getItemName());
		item.setQuantity(this.getQuantity());
		item.setTeaType(this.getTeaType());
		return item;
	}

	public int getItemId() {
		return itemId;
	}



	public void setItemId(int itemId) {
		this.itemId = itemId;
	}



	public String getItemName() {
		return itemName;
	}



	public void setItemName(String itemName) {
		this.itemName = itemName;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public String getTeaType() {
		return teaType;
	}



	public void setTeaType(String teaType) {
		this.teaType = teaType;
	}
	
    @Override
	 public String toString() {
	       return "InventoryDto [itemId=" + itemId + ", itemName=" + itemName + ", quanity=" + quantity + ", teaType="
	               + teaType + "]";
	    }

}
