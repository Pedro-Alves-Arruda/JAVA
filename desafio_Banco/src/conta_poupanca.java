import java.io.IOException;

public class conta_poupanca extends conta{
	
	protected int tempo_na_poupan�a;
	protected int tempo_para_sacar;
	
	
	protected int getTempo_para_sacar() {
		return tempo_para_sacar;
	}

	protected void setTempo_para_sacar(int tempo_para_sacar) {
		this.tempo_para_sacar = tempo_para_sacar;
	}

	protected int getTempo_na_poupan�a() {
		return tempo_na_poupan�a;
	}

	protected void setTempo_na_poupan�a(int tempo_na_poupan�a) {
		this.tempo_na_poupan�a = tempo_na_poupan�a;
	}
	
	/*O metodo depositar dinheiro para a conta poupan�a funciona de forma diferente, ele primeiro pergunta 
	o valor e depois quanto tempo ele quer deixar o dinheiro rendendo na poupan�a, ele valor que ele digitou
	ir� influenciar mais tarde na hora de sacar esse dinheiro.
	*/
	protected String depositarDinheiro() {
		String continua = "";
		System.out.println("Digite o valor do deposito:");
		this.setSaldo(entrada2.nextDouble(), 1);
		System.out.println("Quantos meses o dinheiro ir� ficar na poupan�a:");
		this.setTempo_na_poupan�a(entrada2.nextInt());
		this.setTempo_para_sacar(this.getTempo_na_poupan�a());
		
		//A variavel continua retorna um valor "s" ou "n" que ir� quebrar o while ou deixara que ele continue rodando
		System.out.println("\nDeseja voltar a pagina principal? [S/N]");
		continua = entrada2.next();
		return continua;
	}
	
	public void sacarDinheiro(){
		String resp;
		
		//Programa verifica se o tempo estabelecido para o dinheiro ficar rendendo na poupan�a ja acabou, se sim ele simplesmente saca todo o valor
		//pois estamos partindo do pressuposto que esse banco so permite o sacar todo o valor quando se trata de conta poupan�a,
		//se o tempo n�o tiver acabado ele avisa o usuario e pergunta se ele deseja continuar com a opera��o.
		if(this.getTempo_para_sacar() == 0) {
			this.setSaldo(this.getSaldo(), 2);
		}else{
			System.out.println("\n\nO senhor ainda n�o pode sacar o seu dinheiro\npois o tempo estabelecido para ele na poupan�a ainda n�o encerrou");
			System.out.println("Deseja encerrar e sacar mesmo assim? [S/N]");
			resp = entrada2.next();
			if(resp.equalsIgnoreCase("s")) {
				this.setSaldo(this.getSaldo(),2);
			}
		}
		
	}

}
