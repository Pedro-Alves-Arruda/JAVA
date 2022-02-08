package mamiferos;

public class cachorro extends animal.animal{
	
	private String corOlho;
	private String sexo;
	
	public cachorro(String corOlho, String sexo) {
		this.corOlho = corOlho;
		this.sexo = sexo;
	}
	
	public cachorro() {
		
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
