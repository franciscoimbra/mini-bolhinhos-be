package com.franciscoimbra.bolhinhosbe.service.interfaces;

import com.franciscoimbra.bolhinhosbe.entities.Register;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface RegisterService {

    Register create(final Register register);

    Optional<Register> checkIfExistsByEmailWithObj(final Register register);

    Optional<Register> checkIfExistsByEmailWithString(final String mail);

    UserDetailsService userDetailsService();

}
