package com.franciscoimbra.bolhinhosbe.service;

import com.franciscoimbra.bolhinhosbe.entities.JwtAuthenticationResponse;
import com.franciscoimbra.bolhinhosbe.entities.Registo;

public interface AuthenticationService {
    public JwtAuthenticationResponse signup(Registo request);
    public JwtAuthenticationResponse signin(Registo request);
}
