// Main class to test the implementation
public class SchoolSystem {
    public static void main(String[] args) {
        // Creating instances for each role
        Teacher teacher = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student student = new Student("Ananya", 15, "10th Grade");
        Staff staff = new Staff("Ms. Kapoor", 35, "Administration");

        // Displaying details and roles
        teacher.displayDetails();
        teacher.displayRole();
        System.out.println();

        student.displayDetails();
        student.displayRole();
        System.out.println();

        staff.displayDetails();
        staff.displayRole();
    }
}
