package com.proyecto.cencoe.repository;

import com.proyecto.cencoe.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

}