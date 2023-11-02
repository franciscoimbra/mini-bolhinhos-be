package com.franciscoimbra.bolhinhosbe.controller;

import com.franciscoimbra.bolhinhosbe.entities.Registo;
import com.franciscoimbra.bolhinhosbe.repository.RegistoRepository;
import com.franciscoimbra.bolhinhosbe.service.RegistoService;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class LoginController {

    @Autowired
    private RegistoRepository registoRepository;

    @Autowired
    private RegistoService registoService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<String> registerUser(@RequestBody Registo registo) {
        Registo savedRegister = null;
        ResponseEntity response = null;
        if (registoService.checkIfResgistoExistsByEmail(registo).isEmpty()) {
            try {
                registo.setPwd(passwordEncoder.encode(registo.getPwd()));
                savedRegister = registoRepository.save(registo);
                if (savedRegister != null) {
                    response = ResponseEntity
                            .status(HttpStatus.CREATED)
                            .body("Given user details are successfully registered");

                }
            } catch (Exception ex) {
                response = ResponseEntity
                        .status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body("An exception occured due to " + ex.getMessage());
            }
            return response;
        }
        return response;
    }

    @RequestMapping("/user")
    public Registo getUserDetailsAfterLogin(Authentication authentication) {
        List<Customer> customers = customerRepository.findByEmail(authentication.getName());
        if (customers.size() > 0) {
            return customers.get(0);
        } else {
            return null;
        }

    }
}