package com.franciscoimbra.bolhinhosbe.service.interfaces;


import com.franciscoimbra.bolhinhosbe.entities.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    Client createClient(Client client);

    Optional<Client> checkIfClientExistsByPhone(Client client);

    Optional<Client> checkIfClientExistsByNif(Client client);

    List<Client> getAllClient();

    Optional<Client> getClientByID(Long id);


}
