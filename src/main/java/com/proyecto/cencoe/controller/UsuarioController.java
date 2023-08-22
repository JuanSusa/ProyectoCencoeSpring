package com.proyecto.cencoe.controller;

import com.proyecto.cencoe.entity.Usuario;
import com.proyecto.cencoe.servicio.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService iUsuarioService;

    @PostMapping("/add-user")
    public String saveUser(@RequestBody Usuario usuario) {
        iUsuarioService.saveUsuario(usuario);
        return "Usuario agregado exitosamente";
    }

    @GetMapping("/list-user")
    public List<Usuario> getUser() {
        List<Usuario> usuarioList = iUsuarioService.usuarioList();
        return usuarioList;
    }

    @PatchMapping("/update-user")
    public String upadateUser(@RequestParam Long userId, @RequestParam String userNumdoc, @RequestParam String userName,
            @RequestParam String userLastname, @RequestParam String userAddress, @RequestParam String userPhone,
            @RequestParam String userEmail, @RequestParam String userPassword, @RequestParam Boolean userState) {
        iUsuarioService.updateUsuario(userId, userNumdoc, userName, userLastname, userAddress, userPhone, userEmail,
                userPassword, userState);
        return "Actualizado";
    }
}
