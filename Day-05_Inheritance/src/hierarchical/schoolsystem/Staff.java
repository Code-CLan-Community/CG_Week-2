class Staff extends Person {
     String department;

    // Constructor
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Method to display the role and specific details
    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}
