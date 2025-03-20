class Intern extends Employee {
    int durationInMonths;

    void getDuration(int durationInMonths) {
        this.durationInMonths = durationInMonths;
    }

    @Override
    void displayDetails(String Name, int id, int salary) {
        System.out.println("Intern Details:");
        System.out.println();
        this.Name = Name;
        this.id = id;
        this.salary = salary;
        System.out.println("Name: " + Name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("INTERN for " + durationInMonths + " Months");
        System.out.println();
    }

}