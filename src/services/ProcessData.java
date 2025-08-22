package services;

import entities.Data;



public class ProcessData {
    private final BankService service;

    public ProcessData(BankService service) {
        this.service = service;
    }
    public double processContractWithoutContribution(Data values) {
        if (values.getTimePeriod() == Periodo.ANUAL) {
            if (values.getInterestPeriod() == Periodo.ANUAL) {
                double interest = (Math.pow((1 + values.getInterest()/100), ((double) 1 / 12)) - 1);
                return service.interestRate(values.getAmount(), interest, values.getTime() * 12);
            }
            else  {
                return service.interestRate(values.getAmount(), values.getInterest()/100, values.getTime() * 12);
            }

        }
        else {
            if (values.getInterestPeriod() == Periodo.ANUAL){
                double interest = (Math.pow((1 + values.getInterest()/100), ((double) 1 / 12)) - 1);
                return service.interestRate(values.getAmount(), interest, values.getTime());
            }
            else {
                return service.interestRate(values.getAmount(), values.getInterest() / 100, values.getTime());
            }
        }

    }


    public double processContractWithContribution(Data values) {
        if (values.getTimePeriod() == Periodo.ANUAL) {
            if (values.getInterestPeriod() == Periodo.ANUAL) {
                double interest = (Math.pow((1 + (values.getInterest()/100)), ((double) 1 / 12)) - 1);
                return service.contributionInterestRate(values.getAmount(), interest, values.getTime() * 12, values.getContribution());
            }
            else  {
                return service.contributionInterestRate(values.getAmount(), values.getInterest()/100, values.getTime() * 12, values.getContribution());
            }

        }
        else {
            if (values.getInterestPeriod() == Periodo.ANUAL) {
                double interest = (Math.pow((1 + values.getInterest()/100), ((double) 1 / 12)) - 1);
                return service.contributionInterestRate(values.getAmount(), interest, values.getTime(), values.getContribution());
            }
            else {
                return service.contributionInterestRate(values.getAmount(), values.getInterest()/100, values.getTime(), values.getContribution());
            }
        }
    }
    public double totalInvest(double amount, int time, Periodo periodo) {
        if (periodo == Periodo.ANUAL) {
            return time * 12 * amount + amount;
        }
        else {
            return time * amount + amount;
        }
    }
    public double totalInterestWithContribution(double total, double amount, int time, Periodo periodo) {
        return total - totalInvest(amount, time, periodo);
    }
    public double totalInterestWithoutContribution(double total, double amount) {
        return total - amount;
    }
}
