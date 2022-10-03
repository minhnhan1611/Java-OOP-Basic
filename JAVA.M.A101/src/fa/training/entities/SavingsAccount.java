package fa.training.entities;

public class SavingsAccount {
    private double annualInterestRate;
    private double savingBalance;

    public SavingsAccount() {

    }

    public SavingsAccount(double annualInterestRate, double savingBalance) {
        this.annualInterestRate = annualInterestRate;
        this.savingBalance = savingBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public void calculateMonthlyInterest() {
        double MonthlyInterest = savingBalance * annualInterestRate/12;
        System.out.println(MonthlyInterest + savingBalance);
    }
}
