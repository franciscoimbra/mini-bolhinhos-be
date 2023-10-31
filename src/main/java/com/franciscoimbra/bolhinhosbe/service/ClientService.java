package com.franciscoimbra.bolhinhosbe.service;


import com.franciscoimbra.bolhinhosbe.entities.Client;
import com.franciscoimbra.bolhinhosbe.repository.ClientRepository;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    public Client createClient(Client client);
    public Optional<Client> checkIfClientExistsByPhone(Client client);
    public Optional<Client> checkIfClientExistsByNif(Client client);
    public List<Client> getAllClient();
    public Optional<Client> getClientByID( Long id);




}
