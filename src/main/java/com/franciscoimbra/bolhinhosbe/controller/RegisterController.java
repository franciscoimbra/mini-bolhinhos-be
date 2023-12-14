package com.franciscoimbra.bolhinhosbe.controller;

import com.franciscoimbra.bolhinhosbe.service.interfaces.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @Autowired
    RegisterService registerService;
}
