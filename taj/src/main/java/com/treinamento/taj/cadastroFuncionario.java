package com.treinamento.taj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import com.treinamento.taj.Model.Funcionario;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;

import com.treinamento.taj.Repository.FuncionarioRepository;
import com.treinamento.taj.Services.FuncionarioService;

public class cadastroFuncionario {

	@Autowired
	private FuncionarioService funcionarioService = new FuncionarioService();
	
	InputStream is = System.in;
	InputStreamReader isr = new InputStreamReader(is);
	BufferedReader entrada = new BufferedReader(isr);
	
	protected cadastroFuncionario() throws IOException {
	
	}
	
	protected void cadastrarFuncionario() {
		Funcionario funcionario = new Funcionario();
		try {
			System.out.println("Nome:");
			funcionario.setNome(entrada.readLine());
			System.out.println("CPF:");
			funcionario.setCPF(entrada.readLine());
			System.out.println("RG:");
			funcionario.setRG(entrada.readLine());
			System.out.println("Telefone:");
			funcionario.setTelefone(entrada.readLine());
			System.out.println(funcionario.getNome()+funcionario.getCPF()+funcionario.getRG()+funcionario.getTelefone());
			funcionarioService.insert(funcionario.getNome(), funcionario.getCPF(), funcionario.getRG(), funcionario.getTelefone());
			//salvarFuncionario(this.Funcionarios);
			
		}catch(IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Verifique a entrada de dados");
		}catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showConfirmDialog(null, "Algo deu errado");
		}
	}
		
	protected void alterarDadoCadastrado() {
		
	}
}
