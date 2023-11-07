package com.franciscoimbra.bolhinhosbe.service.serviceImpl;

import com.franciscoimbra.bolhinhosbe.entities.Registo;
import com.franciscoimbra.bolhinhosbe.repository.ClientRepository;
import com.franciscoimbra.bolhinhosbe.repository.RegistoRepository;
import com.franciscoimbra.bolhinhosbe.service.RegistoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class RegistoServiceImpl implements RegistoService {
    @Autowired
    RegistoRepository registoRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public Registo createRegisto(Registo registo) {
        String pwdEncoded = passwordEncoder.encode(registo.getPwd());
        registo.setPwd(pwdEncoded);
        return registoRepository.save(registo);
    }

    @Override
    public Optional<Registo> checkIfResgistoExistsByEmailWithObj(Registo registo) {
        return registoRepository.findByEmail(registo.getEmail());    }

    @Override
    public Optional<Registo> checkIfResgistoExistsByEmailWithString(String mail) {
        return registoRepository.findByEmail(mail);    }

    @Override
    public UserDetailsService userDetailsService() {
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) {
                return registoRepository.findByEmail(username)
                        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
            }
        };
    }
}




