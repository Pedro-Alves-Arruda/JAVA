import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.InputStream;

public abstract class conta {
	protected int agencia = 001;
	protected String numero = "";
	protected double saldo = 0;
	
	/*Foram usados dois tipos de entradas de dados, ja que para entradas de dados maiores, a classe befferedReader
	 * se comporta melhor que a Scanner*/
	InputStream is = System.in;
	InputStreamReader isr = new InputStreamReader(is);
	BufferedReader entrada = new BufferedReader(isr);
	Scanner entrada2 = new Scanner(System.in);
	
	
	protected void abrirConta() throws IOException{
		String resp = "n";
		cliente cliente = new cliente();
		System.out.println("Para abrirmos a sua conta é preciso antes \nrecolher algumas informações, muito bem, vamos começar:");
		
		/*Recolhendo informações importantes do cliente para a abertura da conta, foi criado um while 
		 * que encerra apenas quando o usuario confirma que suas informações estão corretas, se não, ele continua 
		 * recolhendo essas informações até que ele prossiga com a execução*/
		while(resp.equalsIgnoreCase("n")) {
			//Cadastrando o nome do cliente
			System.out.println("nome:");
			cliente.setNome(entrada.readLine());
			
			//Cadastrando o cpf do cliente
			System.out.println("CPF:");
			cliente.setCpf(entrada2.nextLong());
			
			//Cadastrando o rg do cliente
			System.out.println("RG:");
			cliente.setRG(entrada2.nextInt());
			
			//cadastrando o endereço do cliente
			System.out.println("Endereço:");
			cliente.setEndereço(entrada.readLine());
			
			System.out.println("===================================");
			System.out.println("nome:" + cliente.getNome());
			System.out.println("CPF:" + cliente.getCpf());
			System.out.println("RG: MG-" + cliente.getRG());
			System.out.println("Endereço:" + cliente.getEndereço());
			
			System.out.println("\nPor favor confira os dados e digite [S/N] para \ncontinuarmos ou para cadastrar novos dados");
			resp = entrada.readLine();
		}
		
		//Chamada ao metodo que gera um numero aleatorio para a conta do usuario
		String numero = gerarNumeroConta();
		cliente.setNumero(numero);
		
		//Mostrando os dados completos para o usuario
		System.out.println("\nOs dados da sua conta:");
		System.out.println("===================================");
		System.out.println("nome:" + cliente.getNome());
		System.out.println("CPF:" + cliente.getCpf());
		System.out.println("RG: MG-" + cliente.getRG());
		System.out.println("Endereço:" + cliente.getEndereço());
		System.out.println("Agencia:"+cliente.getAgencia());
		System.out.println("Numero da conta:"+cliente.getNumero());
		System.out.println("Saldo: R$"+cliente.getSaldo());
		
		//Após o termino da execução do metodo ele retorna a classe banco e continua da chamada ao metodo abrirConta()
			
	}
	
	
	protected int getAgencia() {
		return agencia;
	}

	protected void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	protected String getNumero() {
		return numero;
	}

	protected void setNumero(String numero) {
		this.numero = numero;
	}
	
	protected double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo, int num) {
		if(num == 1) {
			this.saldo += saldo;
		}else {
			this.saldo -= saldo;
		}
		System.out.println("\nSaldo atualizado: R$"+this.getSaldo());
	}
	
	protected String gerarNumeroConta() {
		String numero = "";
		for(int contador = 0; contador <= 11; contador++) {
			double ale = Math.random() * (10-5);
			int num_ale = (int) ale;
			numero += Integer.toString(num_ale);
			if(contador == 4 || contador == 8) {
				numero += ".";
			}
		}
		return numero;
	}

	protected void sacarDinheiro() {
		int resp;
		System.out.println("Quanto deseja sacar:");
		setSaldo(entrada2.nextInt(), 2);
	}
	
	protected String depositarDinheiro() {
		String continua = "";
		System.out.println("Digite o valor do deposito:");
		this.setSaldo(entrada2.nextDouble(), 1);
		System.out.println("\nDeseja encerrar? [S/N]");
		continua = entrada2.next();
		return continua;
	}
	
	protected void transferir() throws IOException{
		String nome, numeroConta, cpf, agencia, resp="n";
		double valorTransferencia;
		
		while(resp.equalsIgnoreCase("n")) {
			System.out.println("\n\nDigite os dados da conta que deseja transferir:");
			System.out.println("Nome:");
			nome = entrada.readLine();
			System.out.println("Agencia:");
			agencia = entrada.readLine();
			System.out.println("Numero da conta:");
			numeroConta = entrada.readLine();
			System.out.println("CPF:");
			cpf = entrada.readLine();
			
			System.out.println("=============================");
			System.out.println("Nome:"+nome);
			System.out.println("Agencia:"+agencia);
			System.out.println("Numero da conta:"+numeroConta);
			System.out.println("CPF:"+cpf);
			System.out.println("Os dados estão corretos: [S/N]");
			resp = entrada.readLine();
		}
		
		System.out.println("Digite o valor da transferencia:");
		valorTransferencia = entrada2.nextDouble();
		if(valorTransferencia > getSaldo()) {
			System.out.println("Valor indisponivel");
		}else if(valorTransferencia <= getSaldo()) {
			setSaldo(valorTransferencia, 2);
		}
	}
	
	
	
	
}
