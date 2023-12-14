package com.franciscoimbra.bolhinhosbe.service.impl;

import com.franciscoimbra.bolhinhosbe.entities.JwtAuthenticationResponse;
import com.franciscoimbra.bolhinhosbe.entities.Register;
import com.franciscoimbra.bolhinhosbe.entities.Role;
import com.franciscoimbra.bolhinhosbe.service.JwtService;
import com.franciscoimbra.bolhinhosbe.service.interfaces.AuthenticationService;
import com.franciscoimbra.bolhinhosbe.service.interfaces.RegisterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final RegisterService registerService;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public JwtAuthenticationResponse signup(Register request) {
        if (registerService.checkIfExistsByEmailWithObj(request).isEmpty()) {
            final Register register = Register
                .builder()
                .email(request.getEmail())
                .pwd(request.getPassword())
                .role(Role.ROLE_USER)
                .build();

            registerService.create(register);

            return JwtAuthenticationResponse.builder()
                .token(jwtService.generateToken(register))
                .build();

        } else {
            throw new IllegalStateException("User already exists.");
        }
    }

    public JwtAuthenticationResponse signin(Register request) {
        authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
        );

        final Register register = registerService.checkIfExistsByEmailWithString(
            request.getEmail()
        ).orElseThrow(() -> new IllegalArgumentException("Invalid email or password."));

        return JwtAuthenticationResponse.builder()
            .token(jwtService.generateToken(register))
            .build();
    }

}


