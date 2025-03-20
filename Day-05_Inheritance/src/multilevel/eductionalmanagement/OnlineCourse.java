class OnlineCourse extends Course {
    String platform; // Platform like Udemy, Coursera
    boolean isRecorded; // True if the course is recorded

   // Constructor
   public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
       super(courseName, duration); // Call to superclass constructor
       this.platform = platform;
       this.isRecorded = isRecorded;
   }

   @Override
   public String getCourseDetails() {
       return super.getCourseDetails() + ", Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No");
   }
}