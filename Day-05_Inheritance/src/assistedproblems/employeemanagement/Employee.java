class Employee {
    String Name;
    int id;
    int salary;

    void displayDetails(String Name, int id, int salary) {
        System.out.println("Details are: ");
        System.out.println("Name: " + this.Name);
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
        System.out.println();
    }
}