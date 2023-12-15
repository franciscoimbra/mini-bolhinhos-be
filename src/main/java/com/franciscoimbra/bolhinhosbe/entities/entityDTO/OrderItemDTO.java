package com.franciscoimbra.bolhinhosbe.entities.entityDTO;

import com.franciscoimbra.bolhinhosbe.entities.Client;
import com.franciscoimbra.bolhinhosbe.entities.Collaborator;
import com.franciscoimbra.bolhinhosbe.entities.OrderItem;

import java.time.LocalDateTime;
import java.util.List;

public class OrderItemDTO {
    private long id;
    private LocalDateTime orderDate;
    private LocalDateTime pickUpDate;
    private boolean collected;
    private boolean paidOut;
    private Collaborator collaborator;
    private Client client;
    private List<OrderItem> orderItems;


}
