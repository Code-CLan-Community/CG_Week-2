import java.util.*;
abstract class BankAccount {
    final private String accountNumber;
    final private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public abstract double calculateInterest();

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04; // 4% interest
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02; // 2% interest
    }
}

interface Loanable {
    void applyForLoan();

    double calculateLoanEligibility();
}

public class BankManagementSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("S101", "Alice", 10000));
        accounts.add(new CurrentAccount("C202", "Bob", 5000));

        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Interest: " + account.calculateInterest());
            System.out.println();
        }
    }
    
}
