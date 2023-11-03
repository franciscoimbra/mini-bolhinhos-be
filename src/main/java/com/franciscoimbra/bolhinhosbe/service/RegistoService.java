package com.franciscoimbra.bolhinhosbe.service;

import com.franciscoimbra.bolhinhosbe.entities.Client;
import com.franciscoimbra.bolhinhosbe.entities.Registo;

import java.util.Optional;

public interface RegistoService {

    public Registo createRegisto(Registo registo);
    public Optional<Registo> checkIfResgistoExistsByEmailWithObj(Registo registo);

    public Optional<Registo> checkIfResgistoExistsByEmailWithString(String mail);



}
