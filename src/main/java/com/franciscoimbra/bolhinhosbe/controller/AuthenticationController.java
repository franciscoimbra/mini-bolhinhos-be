package com.franciscoimbra.bolhinhosbe.controller;


import com.franciscoimbra.bolhinhosbe.entities.JwtAuthenticationResponse;
import com.franciscoimbra.bolhinhosbe.entities.Registo;
import com.franciscoimbra.bolhinhosbe.service.AuthenticationService;
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
    public JwtAuthenticationResponse signup(@RequestBody Registo request) {
        System.out.println(request);
        return authenticationService.signup(request);
    }

    @PostMapping("/signin")
    public JwtAuthenticationResponse signin(@RequestBody Registo request) {
        return authenticationService.signin(request);
    }
}