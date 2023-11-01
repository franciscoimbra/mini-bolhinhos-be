package com.franciscoimbra.bolhinhosbe.controller;

import com.franciscoimbra.bolhinhosbe.entities.Client;
import com.franciscoimbra.bolhinhosbe.entities.Type;
import com.franciscoimbra.bolhinhosbe.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class typeController {
    @Autowired
    TypeService typeService;

    @RequestMapping(value = "/types", method = RequestMethod.GET)
    public List<Type> getAllTypes() {
        return typeService.getAllTypes();
    }

    @RequestMapping(value = "/type", method = RequestMethod.POST)
    public ResponseEntity<Object> createType(@RequestBody Type type) {
        typeService.createType(type);
        return new ResponseEntity<>("type is created successfully", HttpStatus.CREATED);
    }
}
