import java.util.Scanner;

public class Programa_8 {
    public static void main(String[] args) {
        System.out.println("============================");
        System.out.println("EQUAÇÃO DE 2º GRAU");
        System.out.println("============================");
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor de 'a': ");
        double a = input.nextDouble();
        System.out.println("Digite o valor de 'b': ");
        double b = input.nextDouble();
        System.out.println("Digite o valor de 'c': ");
        double c = input.nextDouble();
        delta(a,b,c);
    }
    public static void delta(double A, double B, double C) {
        Delta = (B * B) - 4*A*C;
        if (Delta > 0) {
            System.out.print("A equação possui duas raízes reais");
        }
        else if (Delta == 0) {
            System.out.print("A equação possui apenas uma raíz real.");
        } else{
            System.out.print("A equação não possui raízes reais");
        }
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       18 @289  �     CURSTEPCHANGED   -1 @34CREATEMUTEX     CHECKFORMUTEXES    LOG     SLEEP     EXEC        �  �     EXPLODE   -1 !36 @18 @18SETARRAYLENGTH    POS    