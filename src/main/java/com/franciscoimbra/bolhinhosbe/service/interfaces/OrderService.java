package com.franciscoimbra.bolhinhosbe.service.interfaces;

import com.franciscoimbra.bolhinhosbe.entities.Order;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderService {
    Order createOrder(Order order);

    List<Order> getAllOrder();

    List<Order> getAllOrderFromDay(LocalDateTime date);
}
