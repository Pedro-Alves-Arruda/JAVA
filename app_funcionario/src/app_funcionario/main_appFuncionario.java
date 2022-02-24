package app_funcionario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main_appFuncionario {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader entrada = new BufferedReader(isr);
		Scanner entrada2 = new Scanner(System.in);
		
		int resp = 0, continua = 0;
		
		funcionario funcionario = new funcionario();
		
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
				funcionario.showId(funcionario.getFuncionario(), funcionario.getDados());
			}else if(resp == 3) {
				funcionario.alterarDadoCadastrado(funcionario.getFuncionario());
				
			}else if(resp == 4) {
				continua = 4;
			}
		}		
	}

}
