
import java.util.Scanner;
// create a class Employee with name, id, salary as data members and display() method to display the details of the employee.
class Employee {
    String name;
    int id;
    double salary;
// method to display the details of the employee
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
// create a class DisplayEmployeeDetail with main method to create an object of Employee class and display
public class DisplayEmployeeDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("Enter Employee Name: ");
        emp.name = sc.nextLine();
        System.out.println("Enter Employee ID: ");
        emp.id = sc.nextInt();
        System.out.println("Enter Employee Salary: ");
        emp.salary = sc.nextDouble();
        // calling display method
        emp.display();
        sc.close();
    }
}
