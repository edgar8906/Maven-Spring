package com.morgo.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiciosMorales {
    
    @Bean
    Persona ejecutarGracia(){
        
        return new CuentaChistes();
    }
}
