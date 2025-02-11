class Manager extends Employee {

    int teamSize;

    public void getTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails(String Name, int id, int salary) {
        System.out.println("Manager Details:");
        System.out.println();
        this.Name = Name;
        this.id = id;
        this.salary = salary;
        System.out.println("Name: " + Name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Team Size " + teamSize);
        System.out.println();

    }
}
