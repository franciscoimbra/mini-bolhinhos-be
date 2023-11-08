package com.franciscoimbra.bolhinhosbe.service.serviceImpl;

import com.franciscoimbra.bolhinhosbe.entities.JwtAuthenticationResponse;
import com.franciscoimbra.bolhinhosbe.entities.Registo;
import com.franciscoimbra.bolhinhosbe.entities.Role;
import com.franciscoimbra.bolhinhosbe.repository.RegistoRepository;
import com.franciscoimbra.bolhinhosbe.service.AuthenticationService;
import com.franciscoimbra.bolhinhosbe.service.JwtService;
import com.franciscoimbra.bolhinhosbe.service.RegistoService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

        private final RegistoRepository registoRepository;
        private final RegistoService registoService;
        private final PasswordEncoder passwordEncoder;
        private final JwtService jwtService;
        private final AuthenticationManager authenticationManager;

        public JwtAuthenticationResponse signup(Registo request) {
            if (registoService.checkIfResgistoExistsByEmailWithObj(request).isEmpty()) {
                var registo = Registo
                        .builder()
                        .email(request.getEmail())
                        .pwd(passwordEncoder.encode(request.getPassword()))
                        .role(Role.ROLE_USER)
                        .build();
                registo = registoService.createRegisto(request);
                var jwt = jwtService.generateToken(registo);
                return JwtAuthenticationResponse.builder().token(jwt).build();
            }
            return null;
        }



        public JwtAuthenticationResponse signin(Registo request) {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
            var registoSalvo = registoService.checkIfResgistoExistsByEmailWithString(request.getEmail())
                    .orElseThrow(() -> new IllegalArgumentException("Invalid email or password."));
            var jwt = jwtService.generateToken(registoSalvo);
            System.out.println(jwt);
            return JwtAuthenticationResponse.builder().token(jwt).build();
        }

    }


