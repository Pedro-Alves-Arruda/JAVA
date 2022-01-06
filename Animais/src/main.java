import mamiferos.gato;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gato gatos[] = new gato[4];
		
		/*gatos[1] = new gato();
		gatos[1].setCorOlho("Azul");
		gatos[1].setSexo("M");
		
		System.out.println(gatos[1].getCorOlho());
		System.out.println(gatos[1].getSexo());
		*/
		for(int cont = 0; cont < gatos.length; cont++) {
			
			Scanner entrada = new Scanner(System.in);
			
			gatos[cont] = new gato();
			
			System.out.println("Digite a cor do olho do seu gatinho:");
			gatos[cont].setCorOlho(entrada.next());
			
			System.out.println("Digite o sexo agora:");
			gatos[cont].setSexo(entrada.next());
		}
		System.out.println("Você tem" + gatos.length+" gatinhos");
		
		for(int cont = 0; cont < gatos.length; cont++) {
		
			System.out.println("O " + (cont+1) + " gatinho tem olho " + gatos[cont].getCorOlho() + " e é do sexo " + gatos[cont].getSexo());
		}
		
	}

}
