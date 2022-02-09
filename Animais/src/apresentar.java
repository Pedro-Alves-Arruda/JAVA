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
			+ "\n3 - Papagaio"
			+ "\n4 - Mostrar meus animais");
		
		resp = teclado.nextInt();
	
	
		switch (resp) {
	
		case 1:
			int totCadastrados;
			System.out.println("Quantos gatos quer cadastrar:");
			totCadastrados = teclado.nextInt();
			gato meus_gatos[] = new gato[totCadastrados]; 
			meus_gatos = cadastrarGato(meus_gatos);
			break;
		case 2:
			System.out.println("Quantos cachorros quer cadastrar:");
			totCadastrados = teclado.nextInt();
			cachorro meus_cachorros[] = new cachorro[totCadastrados]; 
			meus_cachorros = cadastrarCachorro(meus_cachorros);
			break;
		case 3:
			break;
		case 4:
			break;
		}
		
		
	}
	
	
	public gato[] cadastrarGato(gato[] meus_gatos) {
		String resp; 
		String compara = "s";
	
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
		
		showIdGato(meus_gatos);
		
		System.out.println("Deseja cadastrar mais algum animal de estimação? [S/N]");
		resp = teclado.next();
		
		if(resp.equalsIgnoreCase(compara)) {
			apresentar apresenta = new apresentar();
		}
		
		return meus_gatos;
	}
	
	public void showIdGato(gato meus_Gatos[]) {
		System.out.println("Seus gatos:\n");
		
		for(gato value: meus_Gatos) {
			System.out.println("=========================================");
			System.out.println("nome: " + value.nome);
			System.out.println("idade: " +value.idade);
			System.out.println("Peso: " + value.peso);
			System.out.println("Cor do pelo: " + value.corPelo);
			System.out.println("Cor do olho: " + value.getCorOlho());
			System.out.println("sexo: " + value.getSexo());
			System.out.println("\n");
		}
		
	}
	
	public cachorro[] cadastrarCachorro(cachorro[] meus_cachorros) {
		String resp; 
		String compara = "s";
	
		for(int cont = 0; cont < meus_cachorros.length; cont++) {
			
		meus_cachorros[cont] = new cachorro();
		
		System.out.println("=========================================");
		
		//Adicionando o nome
		System.out.println("Digite o nome do cachorro " + (cont + 1) + ":");
		meus_cachorros[cont].nome = teclado.next();
		
		
		//Adicionando a idade
		System.out.println("Digite a idade do " + meus_cachorros[cont].nome + ":");
		meus_cachorros[cont].idade = teclado.nextInt();
		
		
		//adicionando o peso
		System.out.println("Digite o peso do " + meus_cachorros[cont].nome + ":");
		meus_cachorros[cont].peso = teclado.nextDouble();
		
		
		//adicionando a cor do pelo
		System.out.println("Digite a cor do pelo do " + meus_cachorros[cont].nome + ":");
		meus_cachorros[cont].corPelo = teclado.next();
		
		
		//adicionando a cor do olho
		System.out.println("Digite a cor do olho do " + meus_cachorros[cont].nome + ":");
		meus_cachorros[cont].setCorOlho(teclado.next());
		
		
		//adicionando o sexo
		System.out.println("Digite o sexo do " + meus_cachorros[cont].nome + ": [M/F]");
		meus_cachorros[cont].setSexo(teclado.next());
		
		}
		
		showIdCachorro(meus_cachorros);
		
		System.out.println("Deseja cadastrar mais algum animal de estimação? [S/N]");
		resp = teclado.next();
		
		if(resp.equalsIgnoreCase(compara)) {
			apresentar apresenta = new apresentar();
		}
		
		return meus_cachorros;
	}
	
	public void showIdCachorro(cachorro[] meus_cachorros) {
		System.out.println("Seus cachorros:\n");
		
		for(cachorro value: meus_cachorros) {
			System.out.println("=========================================");
			System.out.println("nome: " + value.nome);
			System.out.println("idade: " +value.idade);
			System.out.println("Peso: " + value.peso);
			System.out.println("Cor do pelo: " + value.corPelo);
			System.out.println("Cor do olho: " + value.getCorOlho());
			System.out.println("sexo: " + value.getSexo());
			System.out.println("\n");
		}
		
	}
	
}

