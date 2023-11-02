package com.franciscoimbra.bolhinhosbe.repository;

import com.franciscoimbra.bolhinhosbe.entities.Registo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RegistoRepository extends JpaRepository<Registo, Long> {

    Optional<Registo> findByEmail(String email);
}
