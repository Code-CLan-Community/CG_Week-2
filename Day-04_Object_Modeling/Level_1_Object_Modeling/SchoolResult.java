class Subject {
    private String name;
    private float score;

    // Constructor
    public Subject(String name, float score) {
        this.name = name;
        this.score = score;
    }

    // Getters
    public String getName() {
        return name;
    }

    public float getScore() {
        return score;
    }
}

class Student {
    private int id;
    private String name;
    private Subject[] subjects;
    private int subjectCount;

    // Constructor
    public Student(int id, String name, int maxSubjects) {
        this.id = id;
        this.name = name;
        this.subjects = new Subject[maxSubjects];
        this.subjectCount = 0;
    }

    // Add a subject
    public void addSubject(Subject subject) {
        if (subjectCount < subjects.length) {
            subjects[subjectCount++] = subject;
        } else {
            System.out.println("Cannot add more subjects. Maximum limit reached.");
        }
    }

    // Getters
    public Subject[] getSubjects() {
        return subjects;
    }

    public int getSubjectCount() {
        return subjectCount;
    }

    public String getName() {
        return name;
    }
}

class GradeCalculator {
    // Method to calculate grade
    public String computeResults(Student student) {
        Subject[] subjects = student.getSubjects();
        float totalScore = 0;

        for (int i = 0; i < student.getSubjectCount(); i++) {
            totalScore += subjects[i].getScore();
        }

        float average = totalScore / student.getSubjectCount();

        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

// Main Class to demonstrate
public class SchoolResult {
    public static void main(String[] args) {
        Student student = new Student(1, "Rishabh", 5); // Maximum of 5 subjects

        // Adding subjects to the student
        student.addSubject(new Subject("Math", 85));
        student.addSubject(new Subject("Science", 92));
        student.addSubject(new Subject("History", 78));

        GradeCalculator gradeCalculator = new GradeCalculator();
        String grade = gradeCalculator.computeResults(student);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Final Grade: " + grade);
    }
}
