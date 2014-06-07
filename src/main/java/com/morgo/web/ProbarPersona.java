package com.morgo.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProbarPersona {

    public static void main(String[] args) {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ServiciosMorales.class);
        Persona c = ctx.getBean(Persona.class);
        System.out.println(c.ejecutarGracia());
    }
    
}
