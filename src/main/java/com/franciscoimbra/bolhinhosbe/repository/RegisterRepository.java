package com.franciscoimbra.bolhinhosbe.repository;

import com.franciscoimbra.bolhinhosbe.entities.Register;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegisterRepository extends JpaRepository<Register, Long> {

    Optional<Register> findByEmail(String email);
}
