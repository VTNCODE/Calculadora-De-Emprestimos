package application;


import entities.Data;
import services.BankService;
import services.BrazilBank;
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
        System.out.print("Informe a quantida que deseja começar: ");
        double amount = sc.nextDouble();
        System.out.print("Informe a taxa de juros: ");
        double interestRate = sc.nextDouble();
        System.out.print("O juros será mensal ou anual? (MENSAL/ANUAL) ");
        sc.next();
        interestPeriod = sc.nextLine();
        System.out.print("Deseja colocar um aporte mensal? (s/n)");
        char ansawer = sc.next().charAt(0);
        if (ansawer == 's' || ansawer =='S') {
            System.out.print("informe o aporte mensal: ");
            double monthlyContribution = sc.nextDouble();
            System.out.print("O período será mensal ou anual? (MENSAL/ANUAL) ");
            sc.next();
            contributionPeriod = sc.nextLine();
            System.out.print("Informe a quantidade de tempo: ");
            int time = sc.nextInt();
            BankService bankService = new BrazilBank();
            System.out.print("Valor: " + bankService.contributionInterestRate(amount, interestRate,time, monthlyContribution));

        }
        else {
            System.out.print("O período será mensal ou anual? (MENSAL/ANUAL) ");
            contributionPeriod = sc.nextLine();
            sc.next();
            System.out.print("Informe a quantidade de tempo: ");
            int time = sc.nextInt();
            BankService bankService = new BrazilBank();

            Data data = new Data(amount, Periodo.valueOf(interestPeriod), interestRate, Periodo.valueOf(contributionPeriod), time);
        }


        sc.close();
    }
}
