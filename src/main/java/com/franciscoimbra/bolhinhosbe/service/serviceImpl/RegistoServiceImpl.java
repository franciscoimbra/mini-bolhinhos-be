package com.franciscoimbra.bolhinhosbe.service.serviceImpl;

import com.franciscoimbra.bolhinhosbe.entities.Registo;
import com.franciscoimbra.bolhinhosbe.repository.ClientRepository;
import com.franciscoimbra.bolhinhosbe.repository.RegistoRepository;
import com.franciscoimbra.bolhinhosbe.service.RegistoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class RegistoServiceImpl implements RegistoService {
    @Autowired
    RegistoRepository registoRepository;


    @Override
    public Registo createRegisto(Registo registo) {
        return registoRepository.save(registo);
    }

    @Override
    public Optional<Registo> checkIfResgistoExistsByEmail(Registo registo) {
        return registoRepository.findByEmail(registo.getEmail());
    }
}
