package com.franciscoimbra.bolhinhosbe.repository;

import com.franciscoimbra.bolhinhosbe.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
