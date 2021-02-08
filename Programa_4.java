import java.util.Scanner;

public class Programa_4 {
    public static void main(String[] args) {
    saudacao();
    travelTime_budget();
    fusoHorario();
    area();
    }
    public static void saudacao() {
        System.out.println("=============================================");
        System.out.println("OLÁ, BEM VINDO AO PLANEJADOR DE VIAGENS!!");
        System.out.println("=============================================");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.print("Por gentileza, digite seu nome: ");
        String nome = input.nextLine();
        System.out.print(nome + ", poderia por gentileza, nos informar o local desejado para viajar? ");
        String local = input.nextLine();
        System.out.println(nome + ", desejamos uma excelente viagem para " + local + "!!!");
        System.out.println("================================================================================");
        System.out.println("");
    }
    public static void travelTime_budget() {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos dias vão gastar neste destino? ");
        int dia = input.nextInt();
        System.out.print("Qual seu orçamento total para a viagem em USD? ");
        int orcamento = input.nextInt();
        System.out.print("Qual é o símbolo da moeda do local? ");
        String simbolo_moeda = input.next();
        int conversao_horas = dia * 24;
        int conversao_minutos = dia * 1440;
        int conversao_segundos =  dia * 86400;
        int orcamento_dia = orcamento / dia;
        System.out.println("O mesmo ficará no lugar por " + dia + " dias, " + conversao_horas + " horas, " + conversao_minutos + " minutos e " + conversao_segundos + " segundos.");
        System.out.println("Possui $ " + orcamento + " de orçamento para gastar no local. Por dia, o mesmo possui $ " + orcamento_dia + " para gastar.");
        System.out.println("================================================================================");
        System.out.println("");
    }
    public static void fusoHorario() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a diferença de horário, em horas, entre sua casa e seu destino: ");
        int fusoH = input.nextInt();
        System.out.println("Com base em seu retorno, significa que se for 00:00 em sua casa, será " + fusoH + ":00 no seu destino.");
        System.out.println("================================================================================");
        System.out.println("");
    }
    public static void area() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a área quadrada do país destino em KM²: ");
        float area2 = input.nextFloat();
        System.out.println("Em milhas² é " + area2 * 0.386102);
        System.out.println("================================================================================");
        System.out.println("");
    }
}
