package tratamentoDeExcecoes;

public class DivisaoNaoExata extends Exception{
	protected int numerador;
	protected int denominador;
	
	public DivisaoNaoExata(String message, int num, int deno) {
		super(message);
		this.numerador = num;
		this.denominador = deno;
	}
	

}
