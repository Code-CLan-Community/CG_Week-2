import java.util.Scanner;

// Defining FinancialInstitution class to store bank details
class FinancialInstitution {
    // Attributes of the class
    private String fiName;
    private String fiBranch;

    // Constructor for FinancialInstitution
    FinancialInstitution(String fiName, String fiBranch) {
        this.fiName = fiName;
        this.fiBranch = fiBranch;
    }

    // Method to create a new account
    public AccountHolder createAccount() {
        AccountHolder newAccount = new AccountHolder();
        newAccount.collectDetails();
        return newAccount;
    }

    // Method to display financial institution details
    void showInstitutionDetails() {
        System.out.println("Institution name is " + fiName);
        System.out.println("Institution branch name is " + fiBranch);
    }
}

// Defining AccountHolder class to store customer details
class AccountHolder {
    // Attributes of the class
    private String ahName;
    private int ahAge;
    private double ahBalance;

    // Constructor for AccountHolder
    AccountHolder() {
        this.ahName = "Guest";
        this.ahAge = 18;
        this.ahBalance = 0.0;
    }

    Scanner inputScanner = new Scanner(System.in);

    // Method to collect account details from the user
    public void collectDetails() {
        // Taking user input
        System.out.println("Enter your Name ");
        this.ahName = inputScanner.nextLine();
        System.out.println("Enter your Age ");
        this.ahAge = inputScanner.nextInt();
        System.out.println("Add a minimum of 1000 units to open your Account ");
        this.ahBalance = inputScanner.nextDouble();
    }

    // Method to display account holder details
    void showAccountDetails() {
        System.out.println("Account holder name is " + ahName);
        System.out.println("Account holder age is " + ahAge);
    }

    // Method to check account balance
    public void checkBalance() {
        System.out.println("Your current balance is " + ahBalance);
    }
}

// Main class to run the application
class InstitutionAndAccounts{
    public static void main(String[] args) {
        // Creating an instance of FinancialInstitution
        FinancialInstitution fi1 = new FinancialInstitution("ICICI", "Indore");
        fi1.showInstitutionDetails();

        // Creating an instance of AccountHolder
        AccountHolder acc1 = fi1.createAccount();
        acc1.showAccountDetails();
        acc1.checkBalance();
    }
}
