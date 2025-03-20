

public class EmployeeManagement {
    // static variables
    static String companyName = "VR Tech PVT LTD.";
    static int totalEmp = 0;
    // final variable
    final int id;
    String name;
    String designation;

    // Constructor to initalize the values
    public EmployeeManagement(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmp++;
    }

    // display Employee Details
    public void employeeDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee designation: " + designation);
        System.out.println();
        
    }

    // Display the total Numbers of Employees
    static void displayTotalEmployees() {
        System.out.println("The total number of Employees are: " + totalEmp);
    }

    public static void main(String args[]) {
        EmployeeManagement e1 = new EmployeeManagement("Rishabh", 1000, "HR");
        EmployeeManagement e2 = new EmployeeManagement("Veer", 1001, "Senior Analyst");

        if (e1 instanceof EmployeeManagement) {
           e1.employeeDetails();
        }
        if (e2 instanceof EmployeeManagement) {
           e2.employeeDetails();
        }
        displayTotalEmployees();
    }
}
