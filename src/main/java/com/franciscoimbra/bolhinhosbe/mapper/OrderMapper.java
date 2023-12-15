package com.franciscoimbra.bolhinhosbe.mapper;

import com.franciscoimbra.bolhinhosbe.entities.Order;
import com.franciscoimbra.bolhinhosbe.entities.Type;
import com.franciscoimbra.bolhinhosbe.entities.entityDTO.OrderDTO;
import com.franciscoimbra.bolhinhosbe.entities.entityDTO.TypeDTO;
import org.mapstruct.factory.Mappers;

public interface OrderMapper {
    OrderMapper INSTANCE= Mappers.getMapper(OrderMapper.class);
    OrderDTO orderToOrderDTP(Order order);
    Order orderDTOToOrder(OrderDTO orderDTO);
}
