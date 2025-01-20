import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    int marks;

    public void calculateGrade() {
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B+");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C+");
        } else if (marks >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        calculateGrade();
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter Student Name: ");
        student.name = scanner.nextLine();
        System.out.println("Enter Roll Number: ");
        student.rollNumber = scanner.nextInt();
        System.out.println("Enter marks of student: ");
        student.marks = scanner.nextInt();
        // calling display function
        student.displayDetails();
        scanner.close();
    }
}