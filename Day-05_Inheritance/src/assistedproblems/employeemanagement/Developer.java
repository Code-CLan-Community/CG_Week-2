class Developer extends Employee {
    String programming;

    public void getprogramming(String programming) {
        this.programming = programming;
    }

    @Override
    void displayDetails(String Name, int id, int salary) {
        System.out.println("Developer Details:");
        System.out.println();
        this.Name = Name;
        this.id = id;
        this.salary = salary;
        System.out.println("Name: " + Name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Programming Domain " + programming);
        System.out.println();
    }

}