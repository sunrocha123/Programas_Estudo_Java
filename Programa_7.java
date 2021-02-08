import java.util.Scanner;

public class Programa_7 {
    public static void main(String[] args) {
        apresentacao();
        System.out.println("Observação: Serão exibidas as tabuadas anteriores do valor passado.\nPor exemplo: Se você informar a tabuada do 5, serão exibidas as tabuadas do 1,2,3 e 4 também.\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a tabuada que gostaria de ver: ");
        int t = input.nextInt();
        for(int j = 1; j <= t; j++){
            for(int i = 0; i <= 10; i++){
                System.out.println(j + " X " + i + " = " + j * i);
            }
            System.out.println("");
        }
    }
    public static void apresentacao() {
        System.out.println("=================");
        System.out.println("TABUADA!");
        System.out.println("=================");
        System.out.println("");
    }
}
