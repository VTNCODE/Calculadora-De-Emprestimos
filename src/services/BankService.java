package services;

public interface BankService {
    double monthlyInterestRate(double amount, double interestRate, int timeInMonths);
    double annualInterestRate(double amount, double interestRate, int timeInYears);


}
