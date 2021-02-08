import java.util.Scanner;

public class Programa_3 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o dia de seu aniversário: ");
        int day = input.nextInt();
        System.out.println("Digite o mês de seu aniversário: ");
        String mes = input.next();
        System.out.println("Digite o ano de seu aniversário: ");
        int ano = input.nextInt();
        System.out.println("A data de seu aniversário é dia " + day + " de " + mes + " de " + ano);     
    }   
}