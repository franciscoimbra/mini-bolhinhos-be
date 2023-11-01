package com.franciscoimbra.bolhinhosbe.service;

import com.franciscoimbra.bolhinhosbe.entities.Client;
import com.franciscoimbra.bolhinhosbe.entities.Order;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderService {
    public Order createOrder(Order order);

    public List<Order> getAllOrder();

    public List<Order> getAllOrderFromDay(LocalDateTime date);
}
