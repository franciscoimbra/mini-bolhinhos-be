package com.franciscoimbra.bolhinhosbe.repository;

import com.franciscoimbra.bolhinhosbe.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByPhone(String phone);
    Optional<Client> findByNif(String nif);
}
