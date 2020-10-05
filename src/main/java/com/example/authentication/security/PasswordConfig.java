package com.example.authentication.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig {
    @Bean
    public PasswordEncoder passwordEncoder(){

        // Usamos BCrypt para cifrar la contraseña que el usuario nos pasa, con un salt de 10 de fuerza.
        return new BCryptPasswordEncoder(10);
    }
}
