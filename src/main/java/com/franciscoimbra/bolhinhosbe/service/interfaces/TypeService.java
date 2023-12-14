package com.franciscoimbra.bolhinhosbe.service.interfaces;

import com.franciscoimbra.bolhinhosbe.entities.Type;

import java.util.List;

public interface TypeService {

    Type createType(Type type);

    List<Type> getAllTypes();

}
