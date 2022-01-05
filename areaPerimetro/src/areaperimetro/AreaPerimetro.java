
package areaperimetro;
import java.util.Scanner;
public class AreaPerimetro {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Para calcular a area do perimetro primeiro eu preciso das dimensões dele, por favor informe os lados");
        Scanner teclado = new Scanner(System.in);
        Float Dimensoes = teclado.nextFloat();
        System.out.println("Perimetro: " + 4 * Dimensoes);
        System.out.println("Area: " + Dimensoes * Dimensoes);
        
    }
    
}
