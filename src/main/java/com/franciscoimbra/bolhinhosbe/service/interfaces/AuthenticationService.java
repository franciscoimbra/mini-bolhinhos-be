package com.franciscoimbra.bolhinhosbe.service.interfaces;

import com.franciscoimbra.bolhinhosbe.entities.JwtAuthenticationResponse;
import com.franciscoimbra.bolhinhosbe.entities.Register;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(Register request);

    JwtAuthenticationResponse signin(Register request);
}
