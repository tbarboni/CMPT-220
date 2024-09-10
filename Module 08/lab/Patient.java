import java.text.SimpleDateFormat;
import java.util.Date;

public class Patient extends Person {
    private Person person;
    private Doctor doctor;
    private String patientID;
    private Integer age;
    private Date dob;
    private Date dateOfAdmission;
    private Date dateOfDischarge;
    
    public Patient() {
        super();
        patientID = "";
        doctor = new Doctor();
        person = new Person();
        age = 0;
        dob = new Date();
        dateOfAdmission = new Date();
        dateOfDischarge = new Date();
    }

    public Patient(Person person, String patientID, Integer age, Date dob, Doctor doctor, Date dateOfAdmission, Date dateOfDischarge) {
        super();
        this.person = person;
        this.patientID = patientID;
        this.doctor = doctor;
        this.age = age;
        this.dob = dob;
        this.dateOfAdmission = dateOfAdmission;
        this.dateOfDischarge = dateOfDischarge;
    }
    

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public Date getDateOfDischarge() {
        return dateOfDischarge;
    }

    public void setDateOfDischarge(Date dateOfDischarge) {
        this.dateOfDischarge = dateOfDischarge;
    }

    public String getFirstName() {
        return person.getFirstName();
    }

    public String getLastName() {
        return person.getLastName();
    }

    @Override
    public String toString() {
        return "Patient Information:" +
        "\nName: " + getFirstName() + " " + getLastName() + 
        "\nID: "   + patientID + 
        "\nAge: " + age + 
        "\nDate of Birth: " + new SimpleDateFormat("MM-dd-yyyy").format(dob) + 
        "\nAttending Physician: " + doctor + 
        "\nDate of Admission: " + new SimpleDateFormat("MM-dd-yyyy").format(dateOfAdmission) +
        "\nDate of Discharge: " + new SimpleDateFormat("MM-dd-yyyy").format(dateOfDischarge);
    } 
}
