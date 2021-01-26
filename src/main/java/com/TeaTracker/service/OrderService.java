package com.TeaTracker.service;

import com.TeaTracker.pojos.Order;
import com.TeaTracker.repo.OrdersRepo;

public interface OrderService {

	public Order readOrder(int orderId);

    public boolean createOrder(Order order);

    public boolean updateOrder(Order order);

    public boolean deleteOrder(int orderId);

    public void setOrderRepo(OrdersRepo orderRepo);
	
    
}
