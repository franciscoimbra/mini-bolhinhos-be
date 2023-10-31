package com.franciscoimbra.bolhinhosbe.repository;

import com.franciscoimbra.bolhinhosbe.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
