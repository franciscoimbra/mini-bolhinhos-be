package com.franciscoimbra.bolhinhosbe.service;

import com.franciscoimbra.bolhinhosbe.entities.Client;
import com.franciscoimbra.bolhinhosbe.entities.Collaborator;

import java.util.List;

public interface CollaboratorService {

    public List<Collaborator> getAllCollaborator();

    public Collaborator createNewCollaborator(Collaborator collaborator);
}
