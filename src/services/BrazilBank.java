package services;

public class BrazilBank extends InterestRate implements BankService{


    @Override
    public double getTheInterestRate() {
        return getInterestRate();
    }

    @Override
    public double monthlyInterestRate(double amount, double interestRate, int timeInMonths) {
        return 1;
    }

    @Override
    public double annualInterestRate(double amount, double interestRate, int timeInYears) {
        return 0;
    }
}
