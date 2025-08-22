package services;

public class BrazilBank implements BankService{
    
    @Override
    public double interestRate(double amount, double interestRate, int timeInMonths) {
        return amount * Math.pow(1 + interestRate, timeInMonths);
    }

    @Override
    public double contributionInterestRate(double amount, double interestRate, int timeInMonths, double contribution) {
        return amount * Math.pow(1 + interestRate, timeInMonths) + contribution * ((Math.pow(1 + interestRate, timeInMonths) - 1) / interestRate);
    }


}
