// Importing ArrayList class
import java.util.ArrayList;

// Creating Faculty class to store faculty details
class Faculty 
{
    // Creating attributes of the faculty class
    String facultyName;
    String department;

    // Creating Constructor of the class
    Faculty(String facultyName, String department) 
	{
        this.facultyName = facultyName;
        this.department = department;
    }

    // Method to display faculty details
    public void displayFacultyDetails() 
	{
        System.out.println("Faculty Name is " + facultyName);
		System.out.println("Department name is " + department);
    }
}

// Creating Department class that contains faculty objects
class Department 
{
    // Creating attribute to store list of faculty in a department
    String departmentName;
    ArrayList<Faculty> faculties;

    // Creating Constructor of the class
    Department(String departmentName) 
	{
        this.departmentName = departmentName;
        this.faculties = new ArrayList<>();
    }

    // Method to add faculty to department
    public void addFaculty(Faculty faculty) 
	{
        faculties.add(faculty);
    }

    // Method to display department and faculty details
    public void displayDepartmentDetails() 
	{
        System.out.println("Department name is " + departmentName);
        for (Faculty faculty : faculties) 
		{
            faculty.displayFacultyDetails();
        }
    }
}

// Creating University class that contains department objects
class University 
{
    // Creating attribute to store list of departments in the university
    String universityName;
    ArrayList<Department> departments;

    // Creating Constructor of the class
    University(String universityName) 
	{
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    // Method to add department to university
    public void addDepartment(Department department) 
	{
        departments.add(department);
    }

    // Method to display university and department details
    public void displayUniversityDetails() 
	{
        System.out.println("University name is " + universityName);
        for (Department department : departments) 
		{
            department.displayDepartmentDetails();
        }
    }

    // Method to delete university and all associated departments
    public void deleteUniversity() 
	{
        departments.clear();
        System.out.println("University and all associated departments have been deleted.");
    }
}

// Creating Main class to simulate University and Department operations
class UniversityWithFacultiesAndDepartments
{
    // Creating main method
    public static void main(String[] args) 
	{
        // Creating object of University class
        University university = new University("RGPV University");

        // Creating department objects
        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Mechanical");

        // Creating faculty objects
        Faculty faculty1 = new Faculty("Dr. Sanjeev", "Computer Science");
        Faculty faculty2 = new Faculty("Dr. Joy", "Mechanical");

        // Adding faculty to departments
        department1.addFaculty(faculty1);
        department2.addFaculty(faculty2);

        // Adding departments to the university
        university.addDepartment(department1);
        university.addDepartment(department2);

        // Displaying university details
        university.displayUniversityDetails();

        // Deleting university and all departments
        university.deleteUniversity();
    }
}
