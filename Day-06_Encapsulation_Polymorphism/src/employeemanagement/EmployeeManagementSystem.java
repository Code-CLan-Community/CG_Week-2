import java.util.*;

// Abstract class Employee implements the Department interface
abstract class Employee implements Department {
    private final int employeeId;
    private final String name;
    private final double baseSalary;
    private String department;

    public Employee(int employeeId, String name, double baseSalary, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary(double baseSalary);

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Department: " + department);
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

// FullTimeEmployee subclass
class FullTimeEmployee extends Employee {
    private final double fixedSalary;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary, String department) {
        super(employeeId, name, baseSalary, department);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary(double baseSalary) {
        return fixedSalary;
    }
}

// PartTimeEmployee subclass
class PartTimeEmployee extends Employee {
    private final int hoursWorked;
    private final double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate, String department) {
        super(employeeId, name, baseSalary, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary(double baseSalary) {
        return baseSalary + hoursWorked * hourlyRate;
    }
}

// Interface Department
interface Department {
    void assignDepartment(String department);

    String getDepartmentDetails();
}

// Main class to demonstrate functionality
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Employee> employees = new ArrayList<>();
        for(int i =1;i<3;i++){
        System.out.println("Enter base Salary for Employee");
        double baseSalary = sc.nextDouble();
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter fixed salary: ");
        double fixedSalary = sc.nextDouble();
        System.out.println("Enter department: ");
        String department = sc.next();
            employees.add(new FullTimeEmployee(i, name,baseSalary,fixedSalary,department));
        }
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Total Salary: " + emp.calculateSalary(baseSalary));
            System.out.println();
        }

        // Changing department for an employee
        employees.get(0).assignDepartment("Team Lead");
        System.out.println("Updated Department for Pratik: " + employees.get(0).getDepartmentDetails());
    }
}
