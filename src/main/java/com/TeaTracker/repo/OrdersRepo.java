package com.TeaTracker.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.TeaTracker.pojos.Order;


/**
 * 
 * JpaRepository for interacting with {@link Order}
 *
 */

@Repository
public interface OrdersRepo extends JpaRepository<Order, Integer>{

}
