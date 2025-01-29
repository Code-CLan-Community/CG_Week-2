// Importing ArrayList class
import java.util.ArrayList;

// Creating Doctor class to store doctor details
class Doctor 
{
    // Creating attributes of the doctor class
    String doctorName;
    ArrayList<Patient> patients;

    // Creating Constructor of the class
    Doctor(String doctorName) 
	{
        this.doctorName = doctorName;
        this.patients = new ArrayList<>();
    }

    // Method to consult a patient
    public void consult(Patient patient) 
	{
        System.out.println("Doctor " + doctorName + " is consulting Patient " + patient.name);
        patients.add(patient);
    }

    // Method to display doctor details and their patients
    public void displayDoctorDetails() 
	{
        System.out.println("Doctor name is " + doctorName);
        for (Patient patient : patients) 
		{
            System.out.println("Consulting Patient is " + patient.name);
        }
    }
}

// Creating Patient class to store patient details
class Patient 
{
    // Creating attributes of the patient class
    String name;
    ArrayList<Doctor> doctors;

    // Creating Constructor of the class
    Patient(String name) 
	{
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    // Method to consult a doctor
    public void consultDoctor(Doctor doctor) 
	{
        doctor.consult(this);
        doctors.add(doctor);
    }

    // Method to display patient details
    public void displayPatientDetails() 
	{
        System.out.println("Patient name is " + name);
        for (Doctor doctor : doctors) 
		{
            System.out.println("Consulted by Doctor " + doctor.doctorName);
        }
    }
}

// Creating Hospital class to manage doctors and patients
class Hospital 
{
    // Creating attributes to store doctors and patients
    ArrayList<Doctor> doctors;
    ArrayList<Patient> patients;

    // Creating Constructor of the class
    Hospital() 
	{
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Method to add doctor to hospital
    public void addDoctor(Doctor doctor) 
	{
        doctors.add(doctor);
    }

    // Method to add patient to hospital
    public void addPatient(Patient patient) 
	{
        patients.add(patient);
    }

    // Method to display all doctors and patients in the hospital
    public void displayHospitalDetails() 
	{
        System.out.println("Doctors in the hospital");
        for (Doctor doctor : doctors) 
		{
            doctor.displayDoctorDetails();
        }
        System.out.println("Patients in the hospital ");
        for (Patient patient : patients)
		{
            patient.displayPatientDetails();
        }
    }
}

// Creating Main class
class HospitalDoctorsAndPatients 
{
    // Creating main method
    public static void main(String[] args) 
	{
        // Creating object of Hospital class
        Hospital hospital = new Hospital();

        // Creating doctor and patient objects
        Doctor doctor1 = new Doctor("Dr. Neeraj");
        Doctor doctor2 = new Doctor("Dr. Rajan");
        Patient patient1 = new Patient("Veer");
        Patient patient2 = new Patient("Sachin");

        // Adding doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Patients consulting doctors
        patient1.consultDoctor(doctor1);
        patient2.consultDoctor(doctor2);

        // Displaying hospital details
        hospital.displayHospitalDetails();
    }
}
