package com.proyecto.cencoe.servicio;

import com.proyecto.cencoe.dao.UsuarioDao;
import com.proyecto.cencoe.domain.Usuarios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service //anotacion para poder inyectar clase en el controlador
public class UsuariosServiceImpl implements UsuariosService {
    
    @Autowired //Anotacion para inyectar o traer la informacion del obj dao
    public UsuarioDao usuariosDao;
    
    
    @Override
    //anotacion para generar una transaccion en la clase dao
    //readOnly, parametro para solo lectura de la bd
    @Transactional(readOnly = true)
    public List<Usuarios> listarUsuarios(){
        return (List<Usuarios>) usuariosDao.findAll();
    }

    @Override
    @Transactional//anotacion para generar una transaccion en la clase dao
    public void agregar(Usuarios usuarios) {
        usuariosDao.save(usuarios);
    }

    @Override
    @Transactional
    public void eliminar(Usuarios usuarios) {
        usuariosDao.delete(usuarios);
    }
    
    
    
}
