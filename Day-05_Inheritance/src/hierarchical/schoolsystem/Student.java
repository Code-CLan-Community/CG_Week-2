class Student extends Person {
    private String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // Method to display the role and specific details
    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}