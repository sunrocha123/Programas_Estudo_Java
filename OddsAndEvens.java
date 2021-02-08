import java.util.Scanner;
import java.util.*;

public class OddsAndEvens {
    public static void main(String[] args) {
        partOne();
    }
    public static void partOne() {
        System.out.println("Let´s play a game called 'OddsAndEvens'.");
        Scanner input = new Scanner(System.in);
        System.out.print("Whats your name? ");
        String name = input.nextLine();
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
        String choose = input.next();
        if (choose.equals("O")) {
            System.out.print(name + " has picked odds! The computer will be evens.");
        } else {
            System.out.print(name + " has picked evens! The computer will be odds.");
        }
        System.out.println("\n------------------------------------------------------------------");
        System.out.print("How many 'fingers' do you put out? ");
        int fingers = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.print("The computer plays " + computer + " 'fingers'.");
        System.out.println("\n------------------------------------------------------------------\n");
        int sum = fingers + computer;
        System.out.print(fingers + " + " + computer + " = " + sum + "\n");
        if (sum % 2 == 0) {
            System.out.println(sum + " is...even.");
            if (choose.equals("E")) {
                System.out.print("That means " + name + " wins!");
            } else {
                System.out.print("The computer wins!");
            }
        } else {
            System.out.println(sum + " is...odd.");
            if (choose.equals("O")) {
                System.out.print("That means " + name + " wins!");
            } else {
                System.out.print("The computer wins!");
            }
        }
        System.out.println("\n------------------------------------------------------------------");
    }
}