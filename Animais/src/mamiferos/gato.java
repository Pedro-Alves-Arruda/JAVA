package mamiferos;

public class gato{
	
	private String corOlho;
	private String sexo;
	
	public gato() {
	
	}
	
	public gato(String corOlho, String sexo) {
		this.setCorOlho(corOlho);
		this.setSexo(sexo);
		
	}
	
	public String getCorOlho() {
		return corOlho;
	}
	public void setCorOlho(String corOlho) {
		this.corOlho = corOlho;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}
