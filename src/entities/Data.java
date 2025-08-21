package entities;

import services.Periodo;

public class Data {
    private Double amount;
    private Periodo interestPeriod;
    private Double interest;
    private Periodo timePeriod;
    private Integer time;

    public Data() {
    }

    public Data(Double amount, Periodo interestPeriod, Double interest, Periodo timePeriod, Integer time) {
        this.amount = amount;
        this.interestPeriod = interestPeriod;
        this.interest = interest;
        this.timePeriod = timePeriod;
        this.time = time;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Periodo getInterestPeriod() {
        return interestPeriod;
    }

    public void setInterestPeriod(Periodo interestPeriod) {
        this.interestPeriod = interestPeriod;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public Periodo getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(Periodo timePeriod) {
        this.timePeriod = timePeriod;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}
