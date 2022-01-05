
package salario;
import java.util.Scanner;
public class Salario {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = teclado.nextLine();
        System.out.println("Bom dia " + nome + "!!! Para calcularmos seu salario precisaremos de algumas informações. Vamos começar");
        
        System.out.println("Horas trabalhadas:");
        int horasTrabalhadas = teclado.nextInt();
        
        System.out.println("Horas extras :");
        int horasExtras = teclado.nextInt();
        
        System.out.println("Valor da hora:");
        int valorHora = teclado.nextInt();
        
        int salarioBruto = ((horasTrabalhadas + horasExtras) * (1 + 100/100)) * valorHora;
        int inss = salarioBruto * (9/100);
        int fgts = (salarioBruto * (8/100));
        int salarioLiquido = salarioBruto - inss;
        
        System.out.println("O valor do salario bruto é R$" + salarioBruto);
        System.out.println("O valor do INSS é : R$"+ inss);
        System.out.println("O valor do FGTS é : R$"+ fgts);
        System.out.println("O valor do Salario liquido e : R$"+ salarioLiquido);
        
    }
    
}
