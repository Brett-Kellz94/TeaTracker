package com.TeaTracker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.TeaTracker.pojos.Inventory;


/**
 * 
 * JpaRepository for interacting with {@link Inventory}
 *
 */

@Repository
public interface InventoryRepo extends JpaRepository<Inventory, Integer>{

}
