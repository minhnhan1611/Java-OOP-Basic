package fa.training.main;

import fa.training.entities.SavingsAccount;

public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(0.04,2000.00);
        SavingsAccount saver2 = new SavingsAccount(0.04, 3000.00);

        System.out.println("The new balances for both savers for 4%");
        System.out.print("saver1: ");
        saver1.calculateMonthlyInterest();
        System.out.print("saver2: ");
        saver2.calculateMonthlyInterest();

        System.out.println("------------------------------------------");
        System.out.println("The new balances for both savers for 5%");
        saver1.setAnnualInterestRate(0.05);
        saver2.setAnnualInterestRate(0.05);
        System.out.print("saver1: ");
        saver1.calculateMonthlyInterest();
        System.out.print("saver2: ");
        saver2.calculateMonthlyInterest();
    }
}
