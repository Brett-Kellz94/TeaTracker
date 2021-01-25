package com.TeaTracker.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.TeaTracker.pojos.Orders;


/**
 * 
 * JpaRepository for interacting with {@link Orders}
 *
 */

@Repository
public interface OrdersRepo extends JpaRepository<Orders, Integer>{

}
