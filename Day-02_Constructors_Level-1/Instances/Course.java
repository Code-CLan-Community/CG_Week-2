public class Course {
    // Instance variables
    String courseName;
    int duration; // in weeks
    double fee;

    // Class variable
    static String instituteName = "Global Academy";

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create courses
        Course course1 = new Course("Java Programming", 10, 500.0);
        Course course2 = new Course("Web Development", 12, 600.0);

        // Display details of each course
        System.out.println("Before Updating Institute Name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();

        // Update institute name
        Course.updateInstituteName("Tech Learning Center");

        // Display details again to show updated institute name
        System.out.println("After Updating Institute Name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}
