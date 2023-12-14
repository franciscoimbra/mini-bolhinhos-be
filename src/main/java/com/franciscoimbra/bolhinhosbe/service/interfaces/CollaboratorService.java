package com.franciscoimbra.bolhinhosbe.service.interfaces;

import com.franciscoimbra.bolhinhosbe.entities.Collaborator;

import java.util.List;

public interface CollaboratorService {

    List<Collaborator> getAllCollaborator();

    Collaborator createNewCollaborator(Collaborator collaborator);
}
