package com.franciscoimbra.bolhinhosbe.controller;

import com.franciscoimbra.bolhinhosbe.entities.Registo;
import com.franciscoimbra.bolhinhosbe.service.RegistoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class RegisterController {
    @Autowired
    RegistoService registoService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<Object> createUser(@RequestBody Registo registo) {
        if (registoService.checkIfResgistoExistsByEmailWithObj(registo).isPresent()) {
            return new ResponseEntity<>("the user is already registered", HttpStatus.FOUND);
        }
        registoService.createRegisto(registo);
        return new ResponseEntity<>("Client is created successfully", HttpStatus.CREATED);
    }
    @RequestMapping("/user")
    public Registo getUserDetailsAfterLogin(Authentication authentication) {
        Optional<Registo> registo = registoService.checkIfResgistoExistsByEmailWithString(authentication.getName());
        return registo.orElse(null);
    }




}
