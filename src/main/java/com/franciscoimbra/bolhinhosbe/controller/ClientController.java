package com.franciscoimbra.bolhinhosbe.controller;

import com.franciscoimbra.bolhinhosbe.entities.Client;
import com.franciscoimbra.bolhinhosbe.service.interfaces.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class ClientController {

    @Autowired
    ClientService clientService;

    @RequestMapping(value = "/client", method = RequestMethod.POST)
    public ResponseEntity<Object> createClient(@RequestBody Client client) {
        if (clientService.checkIfClientExistsByPhone(client).isPresent()) {
            return new ResponseEntity<>("the user is already registered", HttpStatus.FOUND);
        }
        clientService.createClient(client);
        return new ResponseEntity<>("Client is created successfully", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    public List<Client> getAllClient() {
        return clientService.getAllClient();
    }

    @RequestMapping(value = "/client/{id}", method = RequestMethod.GET)
    public Client updateClient(@PathVariable("id") Long id) {
        if(clientService.getClientByID(id).isPresent()){
            return clientService.getClientByID(id).get();
        }
        return null;
    }


}