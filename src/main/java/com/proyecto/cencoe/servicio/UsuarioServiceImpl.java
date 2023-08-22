package com.proyecto.cencoe.servicio;

import com.proyecto.cencoe.entity.Usuario;
import com.proyecto.cencoe.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioRepository iUsuarioRepository;

    @Override
    public void saveUsuario(Usuario usuario) {
        Usuario usuarioSave = iUsuarioRepository.save(usuario);

    }

    @Override
    public List<Usuario> usuarioList() {
        List<Usuario> usuarioList = iUsuarioRepository.findAll();
        if (usuarioList.isEmpty()) {
            return null;
        } else {
            return usuarioList;
        }
    }

    @Override
    public void updateUsuario(Long userId, String userNumdoc, String userName, String userLastname, String userAddress, String userPhone,
            String userEmail, String userPassword, Boolean userState) {
        Optional<Usuario> usuario = iUsuarioRepository.findById(userId);
        if (usuario.isPresent()){
            usuario.get().setUserNumdoc(userNumdoc);
            usuario.get().setUserName(userName);
            usuario.get().setUserLastname(userLastname);
            usuario.get().setUserAddress(userAddress);
            usuario.get().setUserPhone(userPhone);
            usuario.get().setUserEmail(userEmail);
            usuario.get().setUserPassword(userPassword);
            usuario.get().setUserState(userState);
            iUsuarioRepository.save(usuario.get());
        }

    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        iUsuarioRepository.delete(usuario);
    }

}
