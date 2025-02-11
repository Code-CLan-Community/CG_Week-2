public class EducationalCourseSystem {
    public static void main(String[] args) {
        // Create a Course object
        Course course = new Course("Introduction to Programming", 40);
        System.out.println(course.getCourseDetails());

        // Create an OnlineCourse object
        OnlineCourse onlineCourse = new OnlineCourse("Data Science Fundamentals", 50, "Coursera", true);
        System.out.println(onlineCourse.getCourseDetails());

        // Create a PaidOnlineCourse object
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Machine Learning", 60, "Udemy", false, 299.99, 20);
        System.out.println(paidCourse.getCourseDetails());
    }
}
