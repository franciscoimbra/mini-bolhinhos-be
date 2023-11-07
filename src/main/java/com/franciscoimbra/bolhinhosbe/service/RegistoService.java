package com.franciscoimbra.bolhinhosbe.service;

import com.franciscoimbra.bolhinhosbe.entities.Client;
import com.franciscoimbra.bolhinhosbe.entities.Registo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface RegistoService {

    public Registo createRegisto(Registo registo);
    public Optional<Registo> checkIfResgistoExistsByEmailWithObj(Registo registo);

    public Optional<Registo> checkIfResgistoExistsByEmailWithString(String mail);

    public UserDetailsService userDetailsService();


}
