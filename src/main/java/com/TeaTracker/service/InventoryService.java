package com.TeaTracker.service;

import com.TeaTracker.pojos.Inventory;
import com.TeaTracker.repo.InventoryRepo;

public interface InventoryService {

	public Inventory readItem(int itemId);

    public boolean createItem(Inventory item);

    public boolean updateItem(Inventory item);

    public boolean deleteItem(int itemId);

    public void setItemRepo(InventoryRepo itemRepo);
	
}
