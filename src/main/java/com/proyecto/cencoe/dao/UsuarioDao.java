package com.proyecto.cencoe.dao;

import com.proyecto.cencoe.domain.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository <Usuarios, Long>{
    
}
