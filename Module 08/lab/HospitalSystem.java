import java.util.Scanner;
import java.util.Date;

public class HospitalSystem {
    public static void main(String[] args) {
        // Create hard-coded doctor records
        // Create two person objects to use as the doctor's information
        Person doc1 = new Person("John", "Smith");
        Person doc2 = new Person("Kong", "Johnson");

        Doctor doctor1 = new Doctor(doc1, "Cardiology");
        Doctor doctor2 = new Doctor(doc2, "Orthopedics");

        // Create two person objects to use as the patient's information
        Person patient1Person = new Person("Ronald", "McDonald");
        Person patient2Person = new Person("Charlie", "Kelly");
        Person patient3Person = new Person("Dennis", "Reynolds");
        Person patient4Person = new Person("Deandra", "Reynolds");

        // Create hard-coded patient records using the previously created doctor records
        Patient patient1 = new Patient(patient1Person, "0000001", 35, new Date(186, 5, 05), doctor1,
                new Date(120, 11, 11), new Date(120, 12, 12));
        Patient patient2 = new Patient(patient2Person, "0000002", 45, new Date(168, 4, 20), doctor2,
                new Date(120, 12, 12), new Date(120, 12, 27));
        Patient patient3 = new Patient(patient3Person, "0000003", 30, new Date(191, 2, 22), doctor1,
                new Date(120, 11, 16), new Date(120, 12, 22));
        Patient patient4 = new Patient(patient4Person, "0000004", 28, new Date(199, 4, 21), doctor2,
                new Date(120, 11, 26), new Date(120, 12, 12));

        // Display doctor records so the user can select the correct one by number
        System.out.println("Doctor Records:");
        System.out.println("1. " + doctor1);
        System.out.println("2. " + doctor2);

        // Ask the user to enter information about a hospital bill
        Scanner input = new Scanner(System.in);
        System.out.print("Select a doctor (enter doctor number 1 or 2): ");
        int doctorSelection = input.nextInt();

        // Prompt for doctor selection
        // Uses a ternary operator to select the correct doctor instead of if/else
        // statements
        Doctor selectedDoctor = (doctorSelection == 1) ? doctor1 : doctor2;

        System.out.print("Enter pharmacy charges: $");
        double pharmacyCharges = input.nextDouble();

        System.out.print("Enter doctor fee: $");
        double doctorFee = input.nextDouble();

        System.out.print("Enter room charges: $");
        double roomCharges = input.nextDouble();

        // Prompt for patient selection based on the doctor's specialty
        // Lets user select the patient
        System.out.println("Select a patient for the bill: ");
        Patient selectedPatient;
        if (selectedDoctor.getSpeciality().equals("Cardiology")) {
            System.out.println("1. " + patient1Person);
            System.out.println("2. " + patient3Person);
            int patientChoice = input.nextInt();
            selectedPatient = (patientChoice == 1) ? patient1 : patient3;
        } else {
            System.out.println("1. " + patient2Person);
            System.out.println("2. " + patient4Person);
            int patientChoice = input.nextInt();
            selectedPatient = (patientChoice == 1) ? patient2 : patient4;
        }

        // Create the corresponding Bill object
        Bill bill = new Bill(selectedDoctor, selectedPatient, pharmacyCharges, doctorFee, roomCharges);

        // Print the bill information
        System.out.println(bill);

        input.close();
    }
}