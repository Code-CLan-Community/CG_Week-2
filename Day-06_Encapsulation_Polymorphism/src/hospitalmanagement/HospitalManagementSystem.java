// Abstract Class Patient
abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
}

// Interface MedicalRecord
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// InPatient Class
class InPatient extends Patient implements MedicalRecord {
    private double roomCharges;
    private String medicalRecord;

    public InPatient(String patientId, String name, int age, double roomCharges) {
        super(patientId, name, age);
        this.roomCharges = roomCharges;
        this.medicalRecord = "";
    }

    @Override
    public double calculateBill() {
        return roomCharges + 500; // Room charges + base fee
    }

    @Override
    public void addRecord(String record) {
        this.medicalRecord = record;
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Record: " + medicalRecord);
    }
}

// OutPatient Class
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String medicalRecord;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalRecord = "";
    }

    @Override
    public double calculateBill() {
        return consultationFee; // Only consultation fee
    }

    @Override
    public void addRecord(String record) {
        this.medicalRecord = record;
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Record: " + medicalRecord);
    }
}

// Main Class
public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient inpatient = new InPatient("P001", "Alice", 30, 2000);
        Patient outpatient = new OutPatient("P002", "Bob", 25, 500);

        System.out.println(inpatient.getPatientDetails());
        System.out.println("Bill: " + inpatient.calculateBill());

        System.out.println(outpatient.getPatientDetails());
        System.out.println("Bill: " + outpatient.calculateBill());

        if (inpatient instanceof MedicalRecord) {
            MedicalRecord record = (MedicalRecord) inpatient;
            record.addRecord("Admitted for surgery.");
            record.viewRecords();
        }
    }
}
