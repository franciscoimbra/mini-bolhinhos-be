package com.franciscoimbra.bolhinhosbe.service.impl;

import com.franciscoimbra.bolhinhosbe.entities.Type;
import com.franciscoimbra.bolhinhosbe.repository.TypeRepository;
import com.franciscoimbra.bolhinhosbe.service.interfaces.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    TypeRepository typeRepository;

    @Override
    public Type createType(Type type) {
        return typeRepository.save(type);
    }

    @Override
    public List<Type> getAllTypes() {
        return typeRepository.findAll();
    }
}
