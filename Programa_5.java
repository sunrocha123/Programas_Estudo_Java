import java.util.Scanner;

public class Programa_5 {
    public static void main(String[] args) {
        apresentacao();
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        double peso = input.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = input.nextDouble();
        double IMC = peso / (altura * altura);
        if (IMC < 18.5) {
            System.out.println("Abaixo do peso");
        }
        else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Peso normal");
        }
        else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Sobrepeso");
        }
        else if (IMC >= 30 && IMC <= 34.9 ) {
            System.out.println("Obesidade grau I");
        }
        else if (IMC >= 35 && IMC <= 39.9) {
            System.out.println("Obesidade gra II");
        } else {
            System.out.println("Obesidade grau III ou mórbida");
        }
    }
    public static void apresentacao() {
        System.out.println("======================");
        System.out.println("CÁLCULO IMC");
        System.out.println("======================");
        System.out.println("");
    }
}
