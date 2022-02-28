package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.model.Usuarios;
import com.example.repository.UsuariosRepository;

@Service
public class UsuariosServices {
    
    @Autowired
    private UsuariosRepository usuarioRepository;
    
    public Usuarios findByEmail(String email) {

	}

    public Usuarios findById(Integer id){
        return usuarioRepository.getById(id);    
    
    }

    public Usuarios apagarPorID(Integer id){
        return usuarioRepository.delete(id);
    }

    public Usuarios atualizarPorId(Integer id){
        return findById(id);
    }

    public Usuarios insert(Usuarios usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuarios> buscarTodos(){
        return usuarioRepository.findAll();
    }
}
