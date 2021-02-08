import java.util.Scanner;

public class Programa_6 {
    public static void main(String[] args) {
        apresentacao();
        int i = 1;
        double SMedia = 0;
        while (i <= 4) {
            Scanner input = new Scanner(System.in);
            System.out.print("Digite sua " + i +"º nota: ");
            double nota = input.nextDouble();
            i++;
            SMedia += nota;
        }
        double Media = SMedia / 4;
        System.out.println("Sua média final é " + Media);
        if (Media >= 8 ) {
            System.out.print("Status: Aprovado!");
        }
        else if (Media > 6 && Media < 8) {
            System.out.println("Status: Recuperação!\nSerá necessário fazer a prova final!!");
            Scanner input = new Scanner(System.in);
            System.out.print("Digite sua nota da prova final: ");
            double notaF = input.nextDouble();
            if (notaF > 7) {
                System.out.println("2º Status: Aprovado!");
            } else {
                System.out.println("2º Status: Reprovado!");
            }
        } else {
            System.out.print("Status: Reprovado!");
        }
    }
    public static void apresentacao() {
        System.out.println("===================================");
        System.out.println("CÁLCULO DE MÉDIA");
        System.out.println("===================================");
        System.out.println("");
    }
}
