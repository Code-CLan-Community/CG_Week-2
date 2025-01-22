public class Student {
    // Static variable to store the university name shared by all students
    static String universityName = "XYZ University";
    
    // Static variable to keep track of the total number of students enrolled
    static int totalStudents = 0;

    // Final variable for roll number, ensuring it cannot be changed
    final int rollNumber;

    // Instance variables for student name and grade
    String name;
    String grade;

    // Constructor to initialize name, roll number, and grade
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;

        // Increment the total students count every time a new student is created
        totalStudents++;
    }

    // Static method to display the total number of students enrolled
    public static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }
    public static void displayUniversityName() {
        System.out.println("University Name:  " + universityName);
        System.out.println();
    }
    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    // Method to update the grade (only if the object is an instance of Student)
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            System.out.println();
            this.grade = newGrade;
            System.out.println("Grade updated of " + name + ": " + newGrade);
        }
    }

    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student("John Doe", 101, "A");
        Student student2 = new Student("Jane Smith", 102, "B");
        //Display University Name
        displayUniversityName();
        // Display total students
        Student.displayTotalStudents();

        // Display student details
        System.out.println("\nStudent 1 Details:");
        student1.displayStudentDetails();

        System.out.println("\nStudent 2 Details:");
        student2.displayStudentDetails();

        // Update grade for student1
        student1.updateGrade("A+");
        student2.updateGrade("C+");
        // Check if the object is an instance of Student before performing operations
        if (student2 instanceof Student) {
            System.out.println("\nStudent 2 is an instance of Student class.");
        }
    }
}
