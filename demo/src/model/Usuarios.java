package com.example.model.Usuarios;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.fasterxml.classmate.GenericType;

@Entity
public class Usuarios {

    @id
    @GeneratedValue(strategy = GenericType.IDENTITY)
    private Integer id;
    @Column(length = 255)
	private String emailUsuarios;
    @Column(length = 20)
    private String agente;
    
    
    public Usuarios() {
    }
    
    public Usuarios(Integer id, String emailUsuario, String agente) {
    	this.setId(id);
    	this.setEmailUsuarios(emailUsuario);
    	this.setAgente(agente);
    }
    
    public void setId(Integer id) {
    	this.id = id;
    }
    
    public void setEmailUsuario(String emailUsuario) {
    	this.emailUsuarios = emailUsuario;
    }
    
    public void setAgente(String agente) {
    	this.agente = agente;
    }
    
    public Integer getId() {
    	return this.id;
    }
    
    public String getEmailUsuarios() {
    	return this.emailUsuarios;
    }
    
    public String getAgente() {
    	return this.agente;
    }
}
