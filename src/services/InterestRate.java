package services;

public abstract class InterestRate {
    private Double interestRate;

    public InterestRate() {
    }

    public InterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public abstract double getTheInterestRate();
}
