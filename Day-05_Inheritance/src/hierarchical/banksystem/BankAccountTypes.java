public class BankAccountTypes {
    public static void main(String[] args) {
        // Creating instances of each account type
        SavingsAccount savings = new SavingsAccount("SA12345", 5000, 3.5);
        CheckingAccount checking = new CheckingAccount("CA67890", 2000, 1000);
        FixedDeposit fixedDeposit = new FixedDeposit("FD54321", 10000, 5);
        // Displaying details and account type for each account
        savings.displayDetails();
        savings.displayAccountType();
        System.out.println();

        checking.displayDetails();
        checking.displayAccountType();
        System.out.println();

        fixedDeposit.displayDetails();
        fixedDeposit.displayAccountType();
    }
}
