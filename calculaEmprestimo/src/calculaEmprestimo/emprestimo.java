package calculaEmprestimo;

import java.util.Scanner;

public class emprestimo {
	
	private double valorEmprestimo, valorFinalEmprestimo;
	private int tempoPagar;
	
	

	Scanner entrada = new Scanner(System.in);
	
	public emprestimo() {
		
		
		System.out.println("Este programa recolhe o valor do emprestimo que o senhor quer fazer e "
				+ "\nmostra o valor final a ser pago de acordo com os juros atuais e de acordo "
				+ "com o tempo(em meses) escolhido para pagar.");
				System.out.println("Digite o valor do emprestimo:");
				calculaValorFinalEmprestimo(entrada.nextDouble());
				
	}
	
	public void calculaValorFinalEmprestimo(double valorInicialEmprestimo) {
		double txMes, parMes, valorAtual, valorFinalTaxas, somaPrestacoes; 
		
		setValorFinalEmprestimo(valorInicialEmprestimo);
		
		System.out.println("O valor solicitado para emprestimo foi : R$" + valorInicialEmprestimo);
		System.out.println("Atualmente estamos com taxas de 5% ao mês e parcelas do banco de 1% ao mês");
		System.out.println("O senhor deseja pagar este emprestimo de quantos meses:");
		setTempoPagar(entrada.nextInt());
		
		double valorPrestacoes[] = new double[getTempoPagar()];
		
		
		for(int cont = 0; cont < getTempoPagar(); cont++) {
			
			valorAtual = getValorFinalEmprestimo();
			txMes = valorAtual * 0.05;
			parMes = valorAtual * 0.01;
			valorFinalTaxas = txMes + parMes;
			
			System.out.println("Valor da taxa de 5% no " + (cont+1) + " mês: R$" + String.format("%.2f", txMes));
			System.out.println("Valor da parcela do banco no " + (cont+1) + " mês: R$" + String.format("%.2f", parMes));
			System.out.println("Valor final da " +(cont + 1)+ " prestação do emprestimo: R$"+ String.format("%.2f", (valorAtual /getTempoPagar()) + valorFinalTaxas));
			valorPrestacoes[cont] = ((valorAtual / getTempoPagar()) + valorFinalTaxas);
			System.out.println("=================================================================================");
			setValorFinalEmprestimo(valorAtual += valorFinalTaxas); 

			
		}
		
		somaPrestacoes = 0;
		
		for(int cont = 0; cont < getTempoPagar(); cont++) {
			somaPrestacoes += valorPrestacoes[cont];
		}
		
		setValorFinalEmprestimo(somaPrestacoes);
		System.out.println("Valor final pago: R$" + String.format("%.2f", getValorFinalEmprestimo()));
	}

	public double getValorEmprestimo() {
		return valorEmprestimo;
	}

	public void setValorEmprestimo(double valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}
	
	public int getTempoPagar() {
		return tempoPagar;
	}

	public void setTempoPagar(int tempoPagar) {
		this.tempoPagar = tempoPagar;
	}

	public double getValorFinalEmprestimo() {
		return valorFinalEmprestimo;
	}

	public void setValorFinalEmprestimo(double valorFinalEmprestimo) {
		this.valorFinalEmprestimo = valorFinalEmprestimo;
	}
	
	
}
