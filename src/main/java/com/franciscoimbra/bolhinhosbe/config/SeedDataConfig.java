package com.franciscoimbra.bolhinhosbe.config;


import com.franciscoimbra.bolhinhosbe.entities.Registo;
import com.franciscoimbra.bolhinhosbe.entities.Role;
import com.franciscoimbra.bolhinhosbe.repository.RegistoRepository;
import com.franciscoimbra.bolhinhosbe.service.RegistoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class SeedDataConfig implements CommandLineRunner {

    private final RegistoRepository registoRepository;
    private final PasswordEncoder passwordEncoder;
    private final RegistoService registoService;

    @Override
    public void run(String... args) throws Exception {
        
      if (registoRepository.count() == 0) {

          Registo admin = Registo
                      .builder()
                      .email("admin@admin.com")
                      .pwd(passwordEncoder.encode("password"))
                      .role(Role.ROLE_ADMIN)
                      .build();

        registoService.createRegisto(admin);
        log.debug("created ADMIN user - {}", admin);
      }
    }

}
