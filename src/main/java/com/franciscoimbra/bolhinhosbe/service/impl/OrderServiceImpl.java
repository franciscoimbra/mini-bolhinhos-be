package com.franciscoimbra.bolhinhosbe.service.impl;

import com.franciscoimbra.bolhinhosbe.entities.Order;
import com.franciscoimbra.bolhinhosbe.repository.OrderRepository;
import com.franciscoimbra.bolhinhosbe.service.interfaces.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }

    @Override
    public List<Order> getAllOrderFromDay(LocalDateTime date) {
        return orderRepository.findAllByPickUpDate(date);
    }


}
