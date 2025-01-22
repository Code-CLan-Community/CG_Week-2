public class Patient {
    // Static variables
    static String hospitalName = "City Health Hospital";
    static int totalPatients = 0;

    final int patientID;
    String name, ailment;
    int age;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    // Method to display patient details
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }
    public static void main(String[] args) {
        Patient patient1 = new Patient("John Doe", 45, "Fever", 101);
        Patient patient2 = new Patient("Jane Smith", 30, "Cold", 102);
        getTotalPatients(); // Display total patients
        patient1.displayPatientDetails(); // Show patient 1 details
        patient2.displayPatientDetails(); // Show patient 2 details
        getTotalPatients(); // Display updated total patients
    }
}
