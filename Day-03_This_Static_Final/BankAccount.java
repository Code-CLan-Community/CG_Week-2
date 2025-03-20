class BankAccount {
    static String bankName ="VR Finance & Banking";
    String accountHolderName;
    final String accountNumber;
    static int total = 0; 

    BankAccount(String accountHolderName, String accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber= accountNumber;
        total++;

    }
    static void getTotalAccounts(){
        System.out.println("The Total Nuumber Of Accounts are: " + total);
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }
    
   public static void main(String[] args) {

        // Creating BankAccount objects
        BankAccount account1 = new BankAccount("Veer Gupta", "SBI1000");
        BankAccount account2 = new BankAccount("Rishabh", "HDFC10000");
        
        // Displaying account details if the object is an instance of BankAccount
        if (account1 instanceof BankAccount) {
            account1.displayAccountDetails();
        }

        if (account2 instanceof BankAccount) {
            account2.displayAccountDetails();
        }

        // Display total number of accounts
        BankAccount.getTotalAccounts();
   

    } 
}

