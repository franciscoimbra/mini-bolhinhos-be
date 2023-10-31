package com.franciscoimbra.bolhinhosbe.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name="encomenda")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDateTime orderDate;
    private LocalDateTime pickUpDate;
    private boolean collected;
    private boolean paidOut;



    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="collaborator_id")
    private Collaborator collaborator;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="client_id")
    private Client client;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

}
