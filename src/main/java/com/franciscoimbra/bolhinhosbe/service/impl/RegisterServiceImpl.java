package com.franciscoimbra.bolhinhosbe.service.impl;

import com.franciscoimbra.bolhinhosbe.entities.Register;
import com.franciscoimbra.bolhinhosbe.repository.RegisterRepository;
import com.franciscoimbra.bolhinhosbe.service.interfaces.RegisterService;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RegisterServiceImpl implements RegisterService {

    private final RegisterRepository registerRepository;
    private final PasswordEncoder passwordEncoder;

    public RegisterServiceImpl(
        final RegisterRepository registerRepository,
        final PasswordEncoder passwordEncoder
    ) {
        this.registerRepository = registerRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Register create(final Register register) {
        final String pwdEncoded = passwordEncoder.encode(register.getPwd());
        register.setPwd(pwdEncoded);
        return registerRepository.save(register);
    }

    @Override
    public Optional<Register> checkIfExistsByEmailWithObj(final Register register) {
        return registerRepository.findByEmail(register.getEmail());
    }

    @Override
    public Optional<Register> checkIfExistsByEmailWithString(final String mail) {
        return registerRepository.findByEmail(mail);
    }

    @Override
    public UserDetailsService userDetailsService() {
        return username -> registerRepository.findByEmail(username)
            .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}




