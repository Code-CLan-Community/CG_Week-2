class SavingsAccount extends BankAccount{
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method to display account type and specific details
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
