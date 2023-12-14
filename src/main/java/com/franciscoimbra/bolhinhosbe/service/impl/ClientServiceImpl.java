package com.franciscoimbra.bolhinhosbe.service.impl;

import com.franciscoimbra.bolhinhosbe.entities.Client;
import com.franciscoimbra.bolhinhosbe.repository.ClientRepository;
import com.franciscoimbra.bolhinhosbe.service.interfaces.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Optional<Client> checkIfClientExistsByPhone(Client client) {
        return clientRepository.findByPhone(client.getPhone());
    }

    @Override
    public Optional<Client> checkIfClientExistsByNif(Client client) {
        return clientRepository.findByPhone(client.getNif());
    }

    @Override
    public List<Client> getAllClient() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> getClientByID(Long id) {
        return clientRepository.findById(id);
    }


}
