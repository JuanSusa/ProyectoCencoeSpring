package com.proyecto.cencoe.web;

import com.proyecto.cencoe.domain.Usuarios;
import com.proyecto.cencoe.servicio.UsuariosService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller//anotacion para convertir la clase en controlodor
@Slf4j//anotacion para mostrar el log de la clase
public class ControladorUsuario {

    @Autowired//Anotacion para inyectar la informacion de la clase servicio
    private UsuariosService usuariosService;

    @GetMapping("/")
    public String Inicio(Model model) {

        var usuarios = usuariosService.listarUsuarios();
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("usuarios", usuarios);
        return "Login";
    }

    @GetMapping("/registro")
    public String agregar(Usuarios usuarios) {
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid Usuarios usuarios, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "modificar";
        }
        usuariosService.guardar(usuarios);
        return "redirect:/";
    }
    
    @GetMapping("/eliminar")
    public String eliminiar(Usuarios usuarios){
        usuariosService.eliminar(usuarios);
        return "redirect:/";
    }
    
    
}
