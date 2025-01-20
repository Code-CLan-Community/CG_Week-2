class BankAccount {
    // Public variable
    public String accountNumber;

    // Protected variable
    protected String accountHolder;

    // Private variable
    private double balance;

    // Constructor to initialize bank account details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass to demonstrate access modifiers
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor to initialize savings account details
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account details
    @Override
    public void displayAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber); // Accessible because it's public
        System.out.println("Account Holder: " + accountHolder); // Accessible because it's protected
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class to test the implementation
public class BankAccountManagement {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("12345678", "Alice Smith", 5000.0);
        account.displayAccountDetails();
        System.out.println();

        // Deposit and withdraw money
        account.deposit(1000.0);
        account.withdraw(2000.0);
        System.out.println("Updated Balance: $" + account.getBalance());
        System.out.println();

        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("87654321", "Bob Johnson", 10000.0, 3.5);
        savingsAccount.displayAccountDetails();
    }
}

