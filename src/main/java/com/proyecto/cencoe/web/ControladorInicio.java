package com.proyecto.cencoe.web;

import com.proyecto.cencoe.domain.Usuarios;
import com.proyecto.cencoe.servicio.UsuariosServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller//anotacion para convertir la clase en controlodor
@Slf4j//anotacion para mostrar el log de la clase
public class ControladorInicio {
    
    @Autowired//Anotacion para inyectar la informacion de la clase servicio
    private UsuariosServiceImpl usuariosServiceImpl;
    
    @GetMapping("/")
    public String Inicio(Model model){
        
        var usuario = usuariosServiceImpl.listarUsuarios();        
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("usuario",usuario);
        return "Login";}
    
    @PostMapping("/registro")
    public String agregar (Usuarios usuarios){
        usuariosServiceImpl.agregar(usuarios);
        return "redirect:/";
    }
    
}
