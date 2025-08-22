package services;

public interface BankService {
    double interestRate(double amount, double interestRate, int timeInMonths);
    double contributionInterestRate(double amount, double interestRate, int timeInMonths, double contribution);



}
