import java.io.IOException;
import java.util.Scanner;

/*A minha classe banco é responsavel por fazer a introdução do programa e apresentar as funções do app
  e continuar rodando dependendo das respostas do usuario, ou se ele encerra, foi feito dessa forma para que 
  a classe main fique o mais limpa possivel*/

public class Banco {
	public Banco() throws IOException {
		Scanner entrada = new Scanner(System.in);
		String continua = "n";
		int resp = 0;
		
		/*While criado para que o programa se encerre apenas quando o usuario quiser, enquanto ele não digitar 2 o programa continuara rodando*/
		while(resp != 2) {
			
			//Após o usuario dizer que deseja abrir uma conta, ele deve escolher que tipo de conta quer abrir, lembrando que existe diferença na execução dos metodos de cada uma
			System.out.println("1 - Abrir conta\n2 - Encerrar");
			resp = entrada.nextInt();
			if(resp == 1) {
				System.out.println("1 - Abrir conta corrente\n2 - Abrir conta poupança");
				//recolhendo a resposta e ja verificando seu valor para saber qual fluxo seguir
				resp = entrada.nextInt();
				if(resp == 1) {
					conta_corrente conta = new conta_corrente();
					conta.abrirConta();
					/*While criado para que o usuario permaneça nessa pagina de verificar saldo, depositar, sacar e transferir e possa realizar essas ações quantas vezes ele quiser 
					 * e sempre respeitando as regras do programa*/
					
					while(continua.equalsIgnoreCase("n")) {
						System.out.println("\n\nConta aberta com sucesso!!!\n1 - Verificar Saldo\n2 - Depositar\n3 - Sacar\n4 - Realizar transferencia");
						resp = entrada.nextInt();
						if(resp == 1) {
							System.out.println("\nSaldo: R$"+conta.getSaldo());
							System.out.println("\nDeseja voltar a pagina principal? [S/N]");
							continua = entrada.next();
							
						}else if(resp == 2) {
							continua = conta.depositarDinheiro();
							
						}else if(resp == 3) {
							conta.sacarDinheiro();
						}else if(resp == 4) {
							conta.transferir();
						}
					}
				}else if(resp == 2) {
					//Criando objeto da conta poupança para que ele tenha acesso as peculiaridades dos metodos dessa classe, que apesar de ter o mesmo nome, se comportam de forma diferente
					
					conta_poupanca conta = new conta_poupanca();
					conta.abrirConta();
					continua = "n";
					
					/*While criado para que o usuario permaneça nessa pagina de verificar saldo, depositar, sacar e transferir e possa realizar essas ações quantas vezes ele quiser 
					 * e sempre respeitando as regras do programa*/
					while(continua.equalsIgnoreCase("n")) {
						if(conta.getTempo_para_sacar() > 0) {
							conta.tempo_para_sacar --;
						}
						
						System.out.println("\n\nConta aberta com sucesso!!!\n1 - Verificar Saldo\n2 - Depositar\n3 - Sacar\n4 - Realizar transferencia");
						resp = entrada.nextInt();
						if(resp == 1) {
							System.out.println("\nSaldo: R$"+conta.getSaldo());
							System.out.println("\nDeseja voltar para pagina principal? [S/N]");
							continua = entrada.next();
							
						}else if(resp == 2) {
							continua = conta.depositarDinheiro();
							
						}else if(resp == 3) {
							conta.sacarDinheiro();
							
						}else if(resp==4) {
							conta.transferir();
						}
					}
					
				}
			}
		}
	}
}
