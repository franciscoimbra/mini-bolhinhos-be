package com.franciscoimbra.bolhinhosbe.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="authority")
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "registo_id")
    private Registo registo;
}
