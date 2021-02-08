import java.util.Scanner;

public class Programa_9 {
    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("         CODIFICADOR DE NOMES         ");
        System.out.println("======================================");
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome completo: ");
        String nome = input.nextLine();
        nome = nome.toUpperCase();
        if (nome.startsWith("J")) {
            System.out.println("Você é uma pessoa de sorte!");
        } else {
            System.out.println("Você seria uma pessoa de sorte, se seu nome começasse com J");
        }
        System.out.println("Seu nome é composto por " + nome.length() + " caracteres");
        System.out.println();
        for(int i = 0; i <= nome.length(); i++){
            System.out.println("A letra " + nome.charAt(i) + " está na posição " + nome.indexOf(nome.charAt(i)));
        }
    }
}