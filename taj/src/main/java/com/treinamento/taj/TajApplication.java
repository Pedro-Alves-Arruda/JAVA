package com.treinamento.taj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.treinamento.taj.Model.Funcionario;



@SpringBootApplication
public class TajApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(TajApplication.class, args);
		System.out.println("Iniciado...");
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader entrada = new BufferedReader(isr);
		Scanner entrada2 = new Scanner(System.in);
		
		int resp = 0, continua = 0;
		
		cadastroFuncionario funcionario = new cadastroFuncionario();
		
		while(continua != 4) {	
			System.out.println("\n\nBom dia\n===================================================\n"
					+ "1 - Cadastrar novo funcionario\n"
					+ "2 - Mostrar funcionarios cadastrados\n"
					+ "3 - Alterar dado cadastrado\n"
					+ "4 - Encerrar");
			resp = entrada2.nextInt();
			if(resp == 1) {
				funcionario.cadastrarFuncionario();
			}else if(resp == 2) {
				
			}else if(resp == 3) {
				
				
			}else if(resp == 4) {
				continua = 4;
			}
		}		
	}

}
