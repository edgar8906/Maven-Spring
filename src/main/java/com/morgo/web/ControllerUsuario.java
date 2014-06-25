package com.morgo.web;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/servicio-usuario")

public class ControllerUsuario {
    
    @RequestMapping(value="/todos", method=RequestMethod.GET, headers={"Accept=text/html"})
    
    public @ResponseBody String buscarTodos(){
        
        String mensajito="probando el metodo GET para enviar, a todos los usuarios";
        
        return mensajito;
        
    }
    
    @RequestMapping(value="/usuario", method=RequestMethod.GET, headers = {"Accept=Application/json"})
    
    @ResponseBody String mijason(){
      
        ObjectMapper mapeadorjason=new ObjectMapper();
        
        return null;
    }
}
