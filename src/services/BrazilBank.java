package services;

public class BrazilBank extends InterestRate implements BankService{


    @Override
    public double getTheInterestRate() {
        return getInterestRate();
    }

    @Override
    public double interestRate(double amount, double interestRate, int timeInMonths) {
        return amount * Math.pow(1 + (interestRate/100), timeInMonths);
    }

    @Override
    public double contributionInterestRate(double amount, double interestRate, int timeInMonths, double contribution) {
        return amount * Math.pow(1 + (interestRate/100), timeInMonths) + contribution * ((Math.pow(1 + (interestRate/100), timeInMonths) - 1) / (interestRate/100));
    }


}
