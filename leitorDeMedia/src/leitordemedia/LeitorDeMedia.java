package leitordemedia;

import java.util.Scanner;

public class LeitorDeMedia {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        float notas[] = new float[4];
        float media = 0;
        System.out.println("===============BOM DIA !!!!======================");
        System.out.println("Este programa recolhe suas 4 notas do simestre e mostra a media delas");
        
        for(int cont = 1; cont <= 4; cont++){
            System.out.println("Digite a " + cont + " nota:");
            notas[cont-1] = teclado.nextFloat();
            media += notas[cont-1];
        }
        
        System.out.println("===================================");
        for(int i = 1; i <=4; i ++){
            System.out.println("Nota "+i+ ":"+ notas[i-1]);
        }
        System.out.println("Media: "+ media/4);
    }
    
}
