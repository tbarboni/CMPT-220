
// Test the Person class and subclasses
import java.util.Date;

public class TestPerson {
    public static void main(String[] args) {
        // Test the Person class
        Person person = new Person("Bartholomew", "Baker");
        System.out.println(person);

        Person doc = new Person("Malcolm", "Jones");
        System.out.println(doc);
        // Test the Doctor class
        Doctor doctor = new Doctor(doc, "Cardiology");
        System.out.println(doctor);

        // Test the Patient class
        // Use simple date format to parse the date strings
        Patient patient = new Patient(person, "123456", 25, new Date(98, 9, 15), doctor, new Date(123, 11, 27), new Date(123, 11, 30));
        System.out.println(patient);

        Bill bill = new Bill(patient, patient, 1000.50, 250.33, 320.32);
        System.out.println(bill);
    }
}
