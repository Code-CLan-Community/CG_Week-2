class Course {
    String courseName;
    int duration; // Duration in hours

   // Constructor
   public Course(String courseName, int duration) {
       this.courseName = courseName;
       this.duration = duration;
   }

   // Method to display course details
   public String getCourseDetails() {
       return "Course: " + courseName + ", Duration: " + duration + " hours";
   }
}