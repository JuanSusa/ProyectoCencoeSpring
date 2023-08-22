package com.proyecto.cencoe.servicio;

import com.proyecto.cencoe.entity.Usuario;
import java.util.List;

public interface IUsuarioService {

    void saveUsuario(Usuario usuario);

    List<Usuario> usuarioList();

    void updateUsuario(Long userId, String userNumdoc, String userName, String userLastname, String userAddress, String userPhone,
            String userEmail, String userPassword, Boolean userState);

    void deleteUsuario(Usuario usuario);
}
