
public class cliente extends conta{
	private String nome;
	private long cpf;
	private int RG;
	private String enderešo;
	
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected long getCpf() {
		return cpf;
	}
	protected void setCpf(long cpf) {
		this.cpf = cpf;
	}
	protected int getRG() {
		return RG;
	}
	protected void setRG(int rG) {
		RG = rG;
	}
	protected String getEnderešo() {
		return enderešo;
	}
	protected void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	
	
	
}
