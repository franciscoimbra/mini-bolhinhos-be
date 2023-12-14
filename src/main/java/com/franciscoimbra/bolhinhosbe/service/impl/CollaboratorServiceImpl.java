package com.franciscoimbra.bolhinhosbe.service.impl;

import com.franciscoimbra.bolhinhosbe.entities.Collaborator;
import com.franciscoimbra.bolhinhosbe.repository.CollaboratorRepository;
import com.franciscoimbra.bolhinhosbe.service.interfaces.CollaboratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollaboratorServiceImpl implements CollaboratorService {
    @Autowired
    CollaboratorRepository collaboratorRepository;

    @Override
    public List<Collaborator> getAllCollaborator() {
        return collaboratorRepository.findAll();
    }

    @Override
    public Collaborator createNewCollaborator(Collaborator collaborator) {
        return collaboratorRepository.save(collaborator);
    }
}
