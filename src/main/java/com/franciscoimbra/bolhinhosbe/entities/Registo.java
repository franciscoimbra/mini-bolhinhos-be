package com.franciscoimbra.bolhinhosbe.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Set;
@Entity
@Data
@Table(name="registo")
public class Registo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String email;
    @NotNull
    private String pwd;
    private String role;
    @JsonIgnore
    @OneToMany(mappedBy="registo",fetch= FetchType.EAGER)
    private Set<Authority> authorities;
}
