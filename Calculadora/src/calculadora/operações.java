package calculadora;

import java.text.DecimalFormat;
import java.util.Scanner;

public class operações {
	
	public float n1;
	public float n2;
	
	public operações() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Este programa recolhe dois numeros do usuario e retorna o valor "
				+ "\ndas 4 operações primarias feitas com ele.");
		System.out.println("Digite o numero 1:");
		setN1(teclado.nextFloat());
		System.out.println("Digite o numero 2:");
		setN2(teclado.nextFloat());
		
		soma(getN1(), getN2());
		subtrair(getN1(), getN2());
		divisao(getN1(), getN2());
		multiplicacao(getN1(), getN2());
		
		
	}
	
	public void soma(float num1, float num2) {
		System.out.println("===========================================================");
		System.out.println("A soma de " + (int) num1 + " com " + (int) num2 + " e igual a " + (int)(num1 + num2));
	}
	
	public void subtrair(float num1, float num2) {
		System.out.println("A subtração de " + (int) num1 + " por " + (int)num2 + " e igual a " + (int)(num1 - num2));
	}
	
	public void divisao(float num1, float num2) {
		System.out.println("A divisão de " + num1 + " por " + num2 + " e igual a " + String.format("%.2f",num1 / num2));
	}
	
	public void multiplicacao(float num1, float num2) {
		System.out.println("A multiplicação de " + (int)num1 + " por " + (int)num2 + " e igual a " + (int)(num1 * num2));
	}
	
	public float getN1() {
		return n1;
	}
	
	public void setN1(float n1) {
		this.n1 = n1;
	}
	
	public float getN2() {
		return n2;
	}
	
	public void setN2(float n2) {
		this.n2 = n2;
	}
	
	

}
