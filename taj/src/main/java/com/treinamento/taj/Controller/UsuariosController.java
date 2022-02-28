package com.treinamento.taj.Controller;

import com.treinamento.taj.Model.Usuarios;
import com.treinamento.taj.Services.UsuariosServices;
import java.util.List;

import javax.websocket.server.PathParam;

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
@RequestMapping("/user")
public class UsuariosController {

    @Autowired
    private UsuariosServices usuariosService;

    @GetMapping("/hello")
    public String hello() {
        System.out.println("Hello world");
        return "Hello world";
    }

    // @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    // public ResponseEntity<Usuarios> findById(@PathVariable Integer id) {
    //     System.out.println("Cheguei....");
    //     Usuarios usuario = null;
    //     usuario = usuariosService.findById(id);
    //     return ResponseEntity.ok().body(usuario);
    // }

    @RequestMapping(value = "/deleteID", method = RequestMethod.POST)
    public String deleteById(@PathParam("id") Integer id) {
        System.out.println("Metodo de apagar... " + id);
        usuariosService.apagarPorId(id);
        return "deu certo...";
    }

    @PostMapping("/insert")
    public ResponseEntity<Usuarios> insert(@RequestBody Usuarios usuario) {
        System.out.println(usuario);
        usuariosService.insert(usuario);
        return ResponseEntity.ok().body(usuario);
    }

    @GetMapping("findAll")
    public ResponseEntity<List<Usuarios>> findAll() {
        List<Usuarios> usuarios = null;
        usuarios = usuariosService.buscarTodos();
        return ResponseEntity.ok().body(usuarios);
    }

}