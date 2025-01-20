class InnerBankAccount {
    String accountHolder = "Veer";
    String accountNumber = "126727";
    int balance = 100;

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankAccount {

    public static void main(String[] args) {
        InnerBankAccount account = new InnerBankAccount();
        account.deposit(1000);
        account.withdraw(500);
        account.displayBalance();
    }
}
