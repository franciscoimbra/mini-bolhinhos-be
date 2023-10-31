package com.franciscoimbra.bolhinhosbe.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="collaborator")
public class Collaborator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String name;

    @OneToMany(mappedBy = "collaborator", cascade = CascadeType.ALL)
    private List<Order> orders;




}
