package application;


import entities.Data;
import services.BrazilBank;
import services.Periodo;
import services.ProcessData;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String interestPeriod, contributionPeriod;


        System.out.println("----------CALCULADORA DE JUROS COMPOSTOS---------");
        System.out.println();
        System.out.print("Informe a quantida que deseja começar: ");
        double amount = sc.nextDouble();
        System.out.print("O juros será mensal ou anual? (MENSAL/ANUAL) ");
        interestPeriod = sc.next().toUpperCase();
        System.out.print("Informe a taxa de juros: ");
        double interestRate = sc.nextDouble();
        System.out.print("Deseja colocar um aporte mensal? (s/n): ");
        char ansawer = sc.next().charAt(0);
        if (ansawer == 's' || ansawer =='S') {
            System.out.print("informe o aporte mensal: ");
            double monthlyContribution = sc.nextDouble();
            System.out.print("O período será mensal ou anual? (MENSAL/ANUAL) ");
            contributionPeriod = sc.next().toUpperCase();
            System.out.print("Informe a quantidade de tempo: ");
            int time = sc.nextInt();
            Data data = new Data(amount, Periodo.valueOf(interestPeriod), interestRate, monthlyContribution, Periodo.valueOf(contributionPeriod), time);
            ProcessData processData = new ProcessData(new BrazilBank());
            double total = processData.processContractWithContribution(data);
            double totalInvest = processData.totalInvest(amount, monthlyContribution, time,Periodo.valueOf(contributionPeriod));
            double totalInterest = processData.totalInterest(total, totalInvest);
            System.out.println("Total investido: " + String.format("%.2f ",  + totalInvest));
            System.out.println("Total ganho de juros: " + String.format("%.2f ", totalInterest));
            System.out.println("Total: " + String.format("%.2f", processData.processContractWithContribution(data)));

        }
        else {
            System.out.print("O período será mensal ou anual? (MENSAL/ANUAL) ");
            contributionPeriod = sc.next().toUpperCase();
            System.out.print("Informe a quantidade de tempo: ");
            int time = sc.nextInt();
            Data data = new Data(amount, Periodo.valueOf(interestPeriod), interestRate, Periodo.valueOf(contributionPeriod), time);
            ProcessData processData = new ProcessData(new BrazilBank());
            double total = processData.processContractWithoutContribution(data);
            double totalInterest = processData.totalInterest(total, amount);
            System.out.println("Total investido: " + String.format("%.2f ",  + amount));
            System.out.println("Total ganho de juros: " + String.format("%.2f ", totalInterest));
            System.out.println("Total: " + String.format("%.2f", processData.processContractWithoutContribution(data)));

        }



        sc.close();
    }
}
