// Importing ArrayList class
import java.util.ArrayList;

// Creating Course class to store course details
class Course 
{
    // Creating attributes of the course class
    String courseName;
    Professor professor;

    // Creating Constructor of the class
    Course(String courseName) 
	{
        this.courseName = courseName;
    }

    // Method to assign professor to the course
    public void assignProfessor(Professor professor) 
	{
        this.professor = professor;
    }

    // Method to display course details
    public void displayCourseDetails() 
	{
        System.out.println("Course is " + courseName);
        if (professor != null) 
		{
            System.out.println("Taught by Professor " + professor.name);
        }
    }
}

// Creating Professor class to store professor details
class Professor 
{
    // Creating attributes of the professor class
    String name;

    // Creating Constructor of the class
    Professor(String name) 
	{
        this.name = name;
    }

    // Method to assign a course to the professor
    public void assignCourse(Course course) 
	{
        course.assignProfessor(this);
    }

    // Method to display professor details
    public void displayProfessorDetails() 
	{
        System.out.println("Professor is " + name);
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

    // Method to enroll in a course
    public void enrollCourse(Course course) 
	{
        courses.add(course);
    }

    // Method to display student details
    public void displayStudentDetails() 
	{
        System.out.println("Student is " + name);
        for (Course course : courses) 
		{
            System.out.println("Enrolled in " + course.courseName);
        }
    }
}

// Creating Main class
class UniversityManagementSystem
{
    // Creating main method
    public static void main(String[] args) 
	{
        // Creating objects of Course class
        Course course1 = new Course("Java Programming");
        Course course2 = new Course("Data Structures");

        // Creating object of Professor class
        Professor professor1 = new Professor("Dr. Sanjeev");

        // Assigning professor to the courses
        professor1.assignCourse(course1);
        professor1.assignCourse(course2);

        // Creating object of Student class
        Student student1 = new Student("Neeraj");

        // Enrolling student in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);

        // Displaying student and course details
        student1.displayStudentDetails();
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
