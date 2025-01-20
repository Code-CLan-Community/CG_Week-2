class Employee {
    // Public variable
    public String employeeID;

    // Protected variable
    protected String department;

    // Private variable
    private double salary;

    // Constructor to initialize employee details
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void modifySalary(double newSalary) {
        if (newSalary > 0) {
            salary = newSalary;
            System.out.println("Salary updated to: $" + salary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass to demonstrate access modifiers
class Manager extends Employee {
    private String managedTeam;

    // Constructor to initialize manager details
    public Manager(String employeeID, String department, double salary, String managedTeam) {
        super(employeeID, department, salary);
        this.managedTeam = managedTeam;
    }

    // Method to display manager details
    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails(); // Call parent class method
        System.out.println("Managed Team: " + managedTeam);
    }
}

// Main class to test the implementation
public class EmployeeRecords {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("E12345", "IT", 50000.0);
        employee.displayEmployeeDetails();
        System.out.println();

        // Modify salary
        employee.modifySalary(55000.0);
        System.out.println("Updated Salary: $" + employee.getSalary());
        System.out.println();

        // Create a Manager object
        Manager manager = new Manager("M98765", "HR", 75000.0, "Team A");
        manager.displayEmployeeDetails();
    }
}
