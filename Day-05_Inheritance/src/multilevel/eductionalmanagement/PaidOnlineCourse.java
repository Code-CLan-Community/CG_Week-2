class PaidOnlineCourse extends OnlineCourse {
    double fees; // Course fees
    double discount; // Discount in percentage

   // Constructor
   public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fees, double discount) {
       super(courseName, duration, platform, isRecorded); // Call to superclass constructor
       this.fees = fees;
       this.discount = discount;
   }

   @Override
   public String getCourseDetails() {
       double discountedPrice = fees - (fees * discount / 100);
       return super.getCourseDetails() + ", Fees: $" + fees + ", Discount: " + discount + "%, Final Price: $" + discountedPrice;
   }
}