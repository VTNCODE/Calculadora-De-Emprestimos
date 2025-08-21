package application;

import services.Periodo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String interestPeriod, contributionPeriod;

        System.out.println("----------CALCULADORA DE EMPRÉSTIMOS BANCARIOS----------");
        System.out.println();
        System.out.print("Informe a quantida que deseja emprestar: ");
        double amount = sc.nextDouble();
        System.out.print("Informe a taxa de juros: ");
        System.out.print("O juros será mensal ou anual? (MENSAL/ANUAL) ");
        sc.next();
        interestPeriod = sc.nextLine();
        double interestRate = sc.nextDouble();
        System.out.print("Deseja colocar um aporte mensal? (s/n)");
        char ansawer = sc.next().charAt(0);
        if (ansawer == 's' || ansawer =='S') {
            System.out.print("informe o aporte mensal: ");
            double monthlyContribution = sc.nextDouble();
        }
        System.out.print("O período será mensal ou anual? (MENSAL/ANUAL) ");
        sc.next();
        contributionPeriod = sc.nextLine();

        System.out.print("");

        sc.close();
    }
}
