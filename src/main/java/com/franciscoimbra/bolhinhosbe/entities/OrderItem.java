package com.franciscoimbra.bolhinhosbe.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="order_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String quantity;
    private String description;
    private boolean alreadyProduced;
    private boolean paidOut;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="order_id")
    private Order order;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "recipe_orderItem")
    private Recipe recipe;
}
