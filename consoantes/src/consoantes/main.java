package consoantes;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int totConsoantes = 0, resp = 1, totIguais = 0;
		String[] vogais = {"a", "e", "i", "o", "u"};
		String letraAtual;
		
		System.out.println("Este programa recolhe 6 letras do usuario e diz quantas consoantes foram digitadas\nPara encerrar digite 0 ao final");
		System.out.println("==================================================================================");
		
		while(resp != 0) {
			totConsoantes = 0;
			for(int cont = 0; cont <= 5; cont++) {
				
				System.out.println("Digite uma letra qualquer:");
				letraAtual = entrada.next();
				
				for(int contador = 0; contador < vogais.length; contador++) {
					if(letraAtual.equals(vogais[contador])){
						totIguais ++;
					}
				}
				
				if(totIguais == 0) {
					totConsoantes++;
					totIguais = 0;
				}else {
					totIguais = 0;
				}
			}
			System.out.println("Voçe digitou " + totConsoantes + " consoantes no total.\n======================================");
			
			System.out.println("Deseja encerra? se sim digite 0");
			resp = entrada.nextInt();
		}
	}

}
