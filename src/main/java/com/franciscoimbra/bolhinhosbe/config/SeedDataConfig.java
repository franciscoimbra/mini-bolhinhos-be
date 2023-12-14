package com.franciscoimbra.bolhinhosbe.config;


import com.franciscoimbra.bolhinhosbe.entities.Register;
import com.franciscoimbra.bolhinhosbe.entities.Role;
import com.franciscoimbra.bolhinhosbe.repository.RegisterRepository;
import com.franciscoimbra.bolhinhosbe.service.interfaces.RegisterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class SeedDataConfig implements CommandLineRunner {

    private final RegisterRepository registerRepository;
    private final PasswordEncoder passwordEncoder;
    private final RegisterService registerService;

    @Override
    public void run(String... args) throws Exception {

        if (registerRepository.count() == 0) {

            Register admin = Register
                .builder()
                .email("admin@admin.com")
                .pwd(passwordEncoder.encode("password"))
                .role(Role.ROLE_ADMIN)
                .build();

            registerService.create(admin);
            log.debug("created ADMIN user - {}", admin);
        }
    }

}
