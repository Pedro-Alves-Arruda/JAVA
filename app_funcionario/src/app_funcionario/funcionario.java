package app_funcionario;

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

import javax.swing.JOptionPane;






public class funcionario {

	protected String[] Funcionarios = new String[4];
	protected String[] dados = {"Nome","CPF", "RG", "Telefone"};
	protected ArrayList<String> Funcionario = new ArrayList<String>();
	
	InputStream is = System.in;
	InputStreamReader isr = new InputStreamReader(is);
	BufferedReader entrada = new BufferedReader(isr);
	
	protected funcionario() throws IOException {
	
	}
	
	protected void cadastrarFuncionario() {
		try {
			try {
				for(int contador = 0; contador < 4; contador++) {
					System.out.println(this.dados[contador]+":");
					this.Funcionarios[contador] = entrada.readLine();
				}
			}catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Algo deu errado");
			}
			
			salvarFuncionario(this.Funcionarios);
			
		}catch(IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Verifique a entrada de dados");
		}catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showConfirmDialog(null, "Algo deu errado");
		}
		
		
		
	
	}
	
	public String[] getFuncionarios() {
		return Funcionarios;
	}

	public void setFuncionarios(String[] funcionarios) {
		Funcionarios = funcionarios;
	}
	
	public String[] getDados() {
		return dados;
	}

	public void setDados(String[] dados) {
		this.dados = dados;
	}

	public ArrayList<String> getFuncionario() {
		return Funcionario;
	}

	public void setFuncionario(ArrayList<String> funcionario) {
		Funcionario = funcionario;
	}

	protected void showId(ArrayList<String>funcionario, String[] dados){
		
		int limite = 3;
		try {
			for(int cont =0 ; cont < funcionario.size(); cont++) {
				System.out.println(funcionario.get(cont));
				if(cont == limite) {
					System.out.println("==============================");
					limite+=4;
				}
			}
			
		}catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Index não encontrado, por favor verificar " + e.getMessage());
		}catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Algo de errado aconteceu " + e.getMessage());
		}
		
}
	
	protected void salvarFuncionario(String[] funcionario){
		for(int cont = 0; cont < 4; cont++) {
			this.Funcionario.add(funcionario[cont]);
		}
	}

	protected void alterarDadoCadastrado(ArrayList<String>funcionario) {
		String dadoAntigo = ""; 
		String dadoNovo = "";
		try {
			System.out.println("\n\n\n======================================");
			System.out.println("Digite o valor que deseja alterar: [Digite da forma como foi cadastrado]");
			dadoAntigo = entrada.readLine();
			System.out.println("Digite o dado novo:");
			dadoNovo = entrada.readLine();
			funcionario.set(funcionario.indexOf(dadoAntigo), dadoNovo);
		}catch (IOException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Algo deu errado no cadastro das novas informações " + e.getMessage());
		}catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado");
		}
	}
}
