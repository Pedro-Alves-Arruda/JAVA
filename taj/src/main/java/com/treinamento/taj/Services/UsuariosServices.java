package com.treinamento.taj.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.treinamento.taj.Model.Usuarios;
import com.treinamento.taj.Repository.UsuariosRepository;

@Service
public class UsuariosServices {
    
    @Autowired
    private UsuariosRepository usuarioRepository;
    
    public Usuarios findById(Integer id){
        System.out.println("O id : " + id);
        return usuarioRepository.getById(id);
    }

    public List<Usuarios> buscarTodos(){
        return usuarioRepository.findAll();
    }

    public Usuarios insert(Usuarios usuario){
            return usuarioRepository.save(usuario);
    }

    public void apagarPorId(Integer id){
        usuarioRepository.deleteById(id);
    }
}
