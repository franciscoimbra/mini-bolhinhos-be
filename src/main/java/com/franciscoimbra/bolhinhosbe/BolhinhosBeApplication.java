package com.franciscoimbra.bolhinhosbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class BolhinhosBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BolhinhosBeApplication.class, args);
	}


// https://github.com/wazooinc/spring-boot-3-jwt-authentication/blob/main/src/main/java/com/example/springboot3jwtauthentication/services/JwtService.java
}
