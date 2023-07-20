package com.proyecto.cencoe.web;

import com.proyecto.cencoe.dao.UsuarioDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller//anotacion para convertir la clase en controlodor
@Slf4j//anotacion para mostrar el log de la clase
public class ControladorInicio {
    
    @Autowired//Anotacion para inyectar la informacion de la clase dao
    private UsuarioDao usuarioDao;
    
    @GetMapping("/")
    public String Inicio(Model model){
        
        var usuario = usuarioDao.findAll();
        
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("usuario",usuario);
        return "Login";}
    
}
