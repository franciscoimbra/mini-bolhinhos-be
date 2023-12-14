package com.franciscoimbra.bolhinhosbe.controller;


import com.franciscoimbra.bolhinhosbe.entities.JwtAuthenticationResponse;
import com.franciscoimbra.bolhinhosbe.entities.Register;
import com.franciscoimbra.bolhinhosbe.service.interfaces.AuthenticationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public JwtAuthenticationResponse signup(@Valid @RequestBody Register request) {
        return authenticationService.signup(request);
    }

    @PostMapping("/signin")
    public JwtAuthenticationResponse signin(@Valid @RequestBody Register request) {
        return authenticationService.signin(request);
    }
}