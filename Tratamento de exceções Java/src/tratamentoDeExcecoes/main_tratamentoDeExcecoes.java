package tratamentoDeExcecoes;

import java.io.IOException;
import javax.swing.JOptionPane;

public class main_tratamentoDeExcecoes {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int[] numerador = {4,5,8,10};
		int[] denominador = {2,4,0,2,8};
		
		for(int cont = 0; cont <= denominador.length; cont++) {
			try {
				if(numerador[cont] % 2 != 0)
				throw new DivisaoNaoExata("Divisao não exata", numerador[cont], denominador[cont]);
				
				int resultado = numerador[cont]/denominador[0];
				System.out.println(resultado);
				
			}catch (DivisaoNaoExata e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, e.getMessage());
				
			}catch (ArithmeticException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Divisão por zero");
				
			}catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Index não encontrado");
				
			}catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado" + e.getMessage());
				
			}
		}
		
		System.out.println("O programa continua daqui....");
	}
}