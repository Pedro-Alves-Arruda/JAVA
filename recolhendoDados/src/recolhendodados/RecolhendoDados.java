
package recolhendodados;
import java.util.Scanner;
public class RecolhendoDados {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bom dia\n Este programa irá recolher alguns dados do usuario");
        System.out.println("Vamos começar !!!");
        //Recolhendo o nome
        System.out.println("Qual é o seu nome?");
        String nome = teclado.nextLine();
        //Recolhendo a idade
        System.out.println("Qual a sua idade?");
        int idade = teclado.nextInt();
        //Recolhendo o peso
        System.out.println("Qual o seu peso?");
        Float peso = teclado.nextFloat();
        //Recolhendo o telefone
        System.out.println("Qual o seu telefone?");
        int telefone = teclado.nextInt();
        
        //Apresentando os dados do usuario
        System.out.println("========================================");
        System.out.println("Parabéns !! Dados recolhidos com sucesso");
        System.out.println("Nome:" + nome);
        System.out.println("Idade:" + idade);
        System.out.println("Peso:" + peso);
        System.out.println("Telefone:" + telefone);
    }
    
}
