package com.treinamento.taj.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.treinamento.taj.Model.Funcionario;
import com.treinamento.taj.Services.FuncionarioService;

public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	public ResponseEntity<String> insert(@RequestBody Funcionario funcionario) {
        System.out.println(funcionario);
        //funcionarioService.insert(funcionario);
        return ResponseEntity.ok().build();
    }
	
	
}
