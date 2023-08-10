package com.proyecto.cencoe.servicio;

import com.proyecto.cencoe.domain.Usuarios;
import java.util.List;

public interface UsuariosService {
    
    public List<Usuarios> listarUsuarios();
    
    public void guardar (Usuarios usuarios);
    
    public void eliminar (Usuarios usuarios);
    
    public Usuarios buscarUsuario(Usuarios usuarios);
    
}
