package com.treinamento.taj.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuarios;

    @Column(length = 255)
    private String nome_usuarios;

    @Column(length = 255)
	private String email_usuarios;
    private String senha_usuarios;
    private String cpf_cnpj_usuarios;

    @Column(length = 11)
    private Integer tipo_usuarios;

    @Column(length = 1)
    private String status_usuarios;

    @Column(length = 20)
    private String agente;
    
    
    
    public Usuarios() {
    }
    
    public Usuarios(Integer id_usuarios, String nome_usuarios, String email_usuarios, String senha_usuarios,
            String cpf_cnpj_usuarios, Integer tipo_usuarios, String status_usuarios, String agente) {
        this.id_usuarios = id_usuarios;
        this.nome_usuarios = nome_usuarios;
        this.email_usuarios = email_usuarios;
        this.senha_usuarios = senha_usuarios;
        this.cpf_cnpj_usuarios = cpf_cnpj_usuarios;
        this.tipo_usuarios = tipo_usuarios;
        this.status_usuarios = status_usuarios;
        this.agente = agente;
    }

    public void setEmail_Usuario(String emailUsuario) {
    	this.email_usuarios = emailUsuario;
    }
    
    public void setAgente(String agente) {
    	this.agente = agente;
    }
    
    public Integer getId_Usuarios() {
    	return this.id_usuarios;
    }

    public void setId_Usuarios(Integer id){
        this.id_usuarios = id;
    }
    
    public String getEmail_Usuarios() {
    	return this.email_usuarios;
    }
    
    public String getAgente() {
    	return this.agente;
    }

    public String getNome_usuarios() {
        return nome_usuarios;
    }

    public void setNome_usuarios(String nome_usuarios) {
        this.nome_usuarios = nome_usuarios;
    }

    public String getSenha_usuarios() {
        return senha_usuarios;
    }

    public void setSenha_usuarios(String senha_usuarios) {
        this.senha_usuarios = senha_usuarios;
    }

    public String getCpf_cnpj_usuarios() {
        return cpf_cnpj_usuarios;
    }

    public void setCpf_cnpj_usuarios(String cpf_cnpj_usuarios) {
        this.cpf_cnpj_usuarios = cpf_cnpj_usuarios;
    }

    public Integer getTipo_usuarios() {
        return tipo_usuarios;
    }

    public void setTipo_usuarios(Integer tipo_usuarios) {
        this.tipo_usuarios = tipo_usuarios;
    }

    public String getStatus_usuarios() {
        return status_usuarios;
    }

    public void setStatus_usuarios(String status_usuarios) {
        this.status_usuarios = status_usuarios;
    }


}


