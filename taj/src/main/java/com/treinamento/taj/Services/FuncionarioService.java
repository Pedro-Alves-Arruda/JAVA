package com.treinamento.taj.Services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treinamento.taj.Model.Funcionario;
import com.treinamento.taj.Repository.FuncionarioRepository;


@Service
public class FuncionarioService {
	
	@Autowired
    private FuncionarioRepository funcionarioRepository;
	
	@PersistenceContext
    public EntityManager entityManager;
	
	public void insert(String nome, String cpf, String rg, String telefone){
		//funcionarioRepository.insert(nome, cpf, rg, telefone);
		System.out.println("insert into funcionario value (DEFAULT, '"+cpf+"', '"+nome+"', '"+rg+"', '"+telefone+"');");
		funcionarioRepository.insert(nome, cpf, rg, telefone);
		//this.entityManager.createNativeQuery("insert into funcionario value (DEFAULT, '"+cpf+"', '"+nome+"', '"+rg+"', '"+telefone+"');").executeUpdate();
	}

}
