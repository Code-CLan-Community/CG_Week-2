class FixedDeposit extends BankAccount {
    private int maturityPeriod;

    // Constructor
    public FixedDeposit(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    // Method to display account type and specific details
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Maturity Period: " + maturityPeriod + " years");
    }
}