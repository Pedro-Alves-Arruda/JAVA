package com.example.controler;

import com.example.model.Usuarios;
import com.example.services.UsuariosServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/usuarios")
public class UsuariosController{
    
    @Autowired
    private UsuariosServices usuariosService;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<Usuarios> findById(@PathVariable Integer id){
        System.out.println("Cheguei....");
        Usuarios usuario = null;
        usuario = UsuariosServices.findById(id);
        return ResponseEntity.ok().body(usuario);
    }

    @DeleteMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Usuarios> deleteById(@PathVariable Integer id){
        System.out.println("Metodo de apagar...");
        Usuarios usuario = new Usuarios();
        usuario = null;
        usuario = usuariosService.apagarPorID(id);
        return ResponseEntity.ok().body(usuario);
    }

    @PostMapping()
    public ResponseEntity<Usuarios> insert(@RequestBody Usuarios usuario){
        System.out.println(aluno);
        usuarioService.insert(aluno);
        return ResponseEntity.ok().body(aluno);
    }

    @GetMapping()
    public ResponseEntity<List<Usuarios>> findAll(){
        List<Usuarios> usuarios = null;
        usuarios = usuariosService.buscarTodos();
        return ResponseEntity.ok().body(usuarios);
    }

}