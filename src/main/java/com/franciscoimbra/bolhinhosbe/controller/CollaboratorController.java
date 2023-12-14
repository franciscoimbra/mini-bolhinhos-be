package com.franciscoimbra.bolhinhosbe.controller;

import com.franciscoimbra.bolhinhosbe.entities.Collaborator;
import com.franciscoimbra.bolhinhosbe.service.interfaces.CollaboratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequestMapping("/api")
@RestController
public class CollaboratorController {

    @Autowired
    CollaboratorService collaboratorService;

    @RequestMapping(value = "/collaborators", method = RequestMethod.GET)
    public List<Collaborator> getAllCollaborators() {
        return collaboratorService.getAllCollaborator();
    }
}
