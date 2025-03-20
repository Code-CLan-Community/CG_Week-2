class Student {
    // Public variable
    public int rollNumber;

    // Protected variable
    protected String name;

    // Private variable
    private double CGPA;

    // Constructor to initialize student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to set CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA! Please enter a value between 0.0 and 10.0.");
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass to demonstrate use of protected member
class PostgraduateStudent extends Student {
    private String specialization;

    // Constructor to initialize postgraduate student details
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Method to display postgraduate student details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call parent class displayDetails
        System.out.println("Specialization: " + specialization);
    }
}

// Main class to test the implementation
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student(101, "Alice Smith", 9.2);
        student1.displayDetails();
        System.out.println();

        // Modify and access CGPA
        student1.setCGPA(8.5);
        System.out.println("Updated CGPA: " + student1.getCGPA());
        System.out.println();

        // Create a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob Johnson", 8.8, "Data Science");
        pgStudent.displayDetails();
    }
}
