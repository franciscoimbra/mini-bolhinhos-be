package com.franciscoimbra.bolhinhosbe.service.serviceImpl;

import com.franciscoimbra.bolhinhosbe.entities.Collaborator;
import com.franciscoimbra.bolhinhosbe.repository.CollaboratorRepository;
import com.franciscoimbra.bolhinhosbe.service.CollaboratorService;
import com.franciscoimbra.bolhinhosbe.service.OrderService;
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
