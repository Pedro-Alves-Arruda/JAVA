package com.treinamento.taj.Repository;

import com.treinamento.taj.Model.Funcionario;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioRepository{
	
	public static final EntityManager entityManager = null;
	
	@Transactional
	public String insert(String nome, String cpf, String rg, String telefone){
		this.entityManager.createNativeQuery("insert into funcionario value (DEFAULT, '"+cpf+"', '"+nome+"', '"+rg+"', '"+telefone+"');").executeUpdate();
		return "insert into funcionario value (DEFAULT, '"+cpf+"', '"+nome+"', '"+rg+"', '"+telefone+"');";
	}
	
}
