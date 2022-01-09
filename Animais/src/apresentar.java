import java.util.Scanner;
import mamiferos.gato;

public class apresentar {
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
		}
	}
	
	
	public void cadastrarGato() {
		int totCadastrados;
		
		
		
		System.out.println("Quantos gatos quer cadastrar:");
		totCadastrados = teclado.nextInt();
		
		
		gato meus_gatos[] = new gato[totCadastrados];
		
		for(int cont = 0; cont < meus_gatos.length; cont++) {
		meus_gatos[cont] = new gato();
		
		System.out.println("=========================================");
		
		//recolhendo o nome do gato
		System.out.println("Digite o nome do gato " + (cont + 1) + ":");
		meus_gatos[cont].nome = teclado.next();
		
		System.out.println("nome: " + meus_gatos[cont].nome);
		
		//recolhendo a idade do gato
		System.out.println("Digite a idade do gato " + (cont + 1) + ":");
		meus_gatos[cont].idade = teclado.nextInt();
		
		System.out.println("idade: " +meus_gatos[cont].idade);
		
		//recolhendo o peso do gato
		System.out.println("Digite o peso do gato " + (cont + 1) + ":");
		meus_gatos[cont].peso = teclado.nextFloat();
		
		System.out.println("Peso: " + meus_gatos[cont].peso);
		
		//recolhendo a cor do pelo do gato
		System.out.println("Digite a cor do pelo do gato " + (cont + 1) + ":");
		meus_gatos[cont].corPelo = teclado.next();
		
		System.out.println("Cor do pelo: " + meus_gatos[cont].corPelo);
		
		//recolhendo a cor do olho do gato
		System.out.println("Digite a cor do olho do gato " + (cont + 1) + ":");
		meus_gatos[cont].setCorOlho(teclado.next());
		
		System.out.println("Cor do olho: " + meus_gatos[cont].getCorOlho());
		
		//recolhendo o sexo do gato
		System.out.println("Digite o sexo do gato " + (cont + 1) + ": [M/F]");
		meus_gatos[cont].setSexo(teclado.next());
		
		System.out.println("sexo: " + meus_gatos[cont].getSexo());
		
		}
	} 
	
}

