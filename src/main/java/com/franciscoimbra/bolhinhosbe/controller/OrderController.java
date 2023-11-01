package com.franciscoimbra.bolhinhosbe.controller;

import com.franciscoimbra.bolhinhosbe.entities.Order;
import com.franciscoimbra.bolhinhosbe.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;


    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public List<Order> getAllOrders() {
        return orderService.getAllOrder();
    }


    @RequestMapping(value = "/orders-day/{date}", method = RequestMethod.GET)
    public List<Order> getOrderBydaet (@PathVariable("date") LocalDateTime date) {
        return orderService.getAllOrderFromDay(date);
    }

}
