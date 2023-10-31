package com.franciscoimbra.bolhinhosbe.service;

import com.franciscoimbra.bolhinhosbe.entities.Client;
import com.franciscoimbra.bolhinhosbe.entities.Type;

import java.util.List;

public interface TypeService {

    public Type createType(Type type);

    public List<Type> getAllTypes();

}
