import java.util.Scanner;

import mamiferos.cachorro;
import mamiferos.gato;


public class apresentar{
Scanner teclado = new Scanner(System.in);	

	public apresentar() {
		
		int resp;
		System.out.println("Bom dia, o objetivo é cadastrar o seu bichinho de estimação"
			+ " para que possamos dar o melhor cuidado para ele."
			+ "\nDigite o numero de qual animal quer cadastrar:"
			+ "\n1 - Gato"
			+ "\n2 - Cachorro"
			+ "\n3 - Papagaio");
		
		resp = teclado.nextInt();
	
	
		switch (resp) {
	
		case 1:
			cadastrarGato();
			break;
		case 2:
			
			break;
		}
	}
	
	
	public void cadastrarGato() {
		int totCadastrados;
		String resp; 
		String compara = "s";
		
		System.out.println("Quantos gatos quer cadastrar:");
		totCadastrados = teclado.nextInt();
		
		
		gato meus_gatos[] = new gato[totCadastrados];
		
		for(int cont = 0; cont < meus_gatos.length; cont++) {
			
		meus_gatos[cont] = new gato();
		
		System.out.println("=========================================");
		
		//Adicionando o nome
		System.out.println("Digite o nome do gato " + (cont + 1) + ":");
		meus_gatos[cont].nome = teclado.next();
		
		
		//Adicionando a idade
		System.out.println("Digite a idade do " + meus_gatos[cont].nome + ":");
		meus_gatos[cont].idade = teclado.nextInt();
		
		
		//adicionando o peso
		System.out.println("Digite o peso do " + meus_gatos[cont].nome + ":");
		meus_gatos[cont].peso = teclado.nextDouble();
		
		
		//adicionando a cor do pelo
		System.out.println("Digite a cor do pelo do " + meus_gatos[cont].nome + ":");
		meus_gatos[cont].corPelo = teclado.next();
		
		
		//adicionando a cor do olho
		System.out.println("Digite a cor do olho do " + meus_gatos[cont].nome + ":");
		meus_gatos[cont].setCorOlho(teclado.next());
		
		
		//adicionando o sexo
		System.out.println("Digite o sexo do " + meus_gatos[cont].nome + ": [M/F]");
		meus_gatos[cont].setSexo(teclado.next());
		
		}
		
		//chamando o metodo que mostra os dados do gato depois de inserido
		showIdGato(meus_gatos);
		
		System.out.println("Deseja cadastrar mais algum animal de estimação? [S/N]");
		resp = teclado.next();
		
		if(resp.equalsIgnoreCase(compara)) {
			apresentar apresenta = new apresentar();
		}
	}
	
	public void showIdGato(gato meus_Gatos[]) {
		for(int cont = 0; cont < meus_Gatos.length; cont++) {
			System.out.println("=========================================");
			System.out.println("nome: " + meus_Gatos[cont].nome);
			System.out.println("idade: " +meus_Gatos[cont].idade);
			System.out.println("Peso: " + meus_Gatos[cont].peso);
			System.out.println("Cor do pelo: " + meus_Gatos[cont].corPelo);
			System.out.println("Cor do olho: " + meus_Gatos[cont].getCorOlho());
			System.out.println("sexo: " + meus_Gatos[cont].getSexo());
			System.out.println("\n");
		}
		
	}
	
	

}

