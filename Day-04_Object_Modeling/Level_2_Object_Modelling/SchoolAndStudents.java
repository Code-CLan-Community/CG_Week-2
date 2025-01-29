// Importing ArrayList class
import java.util.ArrayList;

// Creating Course class to store course details
class Course 
{
    // Creating attributes of the course class
    String courseName;
    ArrayList<Student> enrolledStudents;

    // Creating Constructor of the class
    Course(String courseName) 
	{
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Method to enroll a student in the course
    public void enrollStudent(Student student) 
	{
        enrolledStudents.add(student);
    }

    // Method to display course details
    public void displayCourseDetails() 
	{
        System.out.println("Course name is " + courseName);
        for (Student student : enrolledStudents) 
		{
            System.out.println("Student name is " + student.name);
        }
    }
}

// Creating Student class to store student details
class Student 
{
    // Creating attributes of the student class
    String name;
    ArrayList<Course> courses;

    // Creating Constructor of the class
    Student(String name) 
	{
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method for a student to enroll in a course
    public void enrollInCourse(Course course) 
	{
        courses.add(course);
        course.enrollStudent(this);
    }

    // Method to display student details and courses
    public void displayStudentDetails() 
	{
        System.out.println("Student name is " + name);
        for (Course course : courses) 
		{
            System.out.println("Enrolled in " + course.courseName);
        }
    }
}

// Creating School class to store list of students
class School 
{
    // Creating attribute to store list of students in the school
    ArrayList<Student> students;

    // Creating Constructor of the class
    School() 
	{
        this.students = new ArrayList<>();
    }

    // Method to add student to the school
    public void addStudent(Student student) 
	{
        students.add(student);
    }

    // Method to display all students in the school
    public void displayAllStudents() 
	{
        for (Student student : students) 
		{
            student.displayStudentDetails();
        }
    }
}

// Creating Main class to simulate School, Student, and Course operations
class SchoolAndStudents 
{
    // Creating main method
    public static void main(String[] args) 
	{
        // Creating objects of Course class
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Physics");

        // Creating object of Student class
        Student student1 = new Student("Anuj");
        Student student2 = new Student("Prateek");

        // Creating object of School class
        School school = new School();

        // Adding students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Enrolling students in courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        // Displaying student details and their enrolled courses
        school.displayAllStudents();
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
