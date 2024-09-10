// Bill should not extend person. because it is not a person. It is a bill.
public class Bill extends Person {
    private Person person;
    private Patient patient;
    private double pharmacyCharges;
    private double doctorFee;
    private double roomCharges;

    // Create constructors for Bill
    public Bill() {
        super();
        person = new Person();
        patient = new Patient();
        pharmacyCharges = 0;
        doctorFee = 0;
        roomCharges = 0;
    }

    public Bill(Person person, Patient patient, double pharmacyCharges,
            double doctorFee, double roomCharges) {
        super();
        this.person = person;
        this.patient = patient;
        this.pharmacyCharges = pharmacyCharges;
        this.doctorFee = doctorFee;
        this.roomCharges = roomCharges;
    }

    // Create Setters and Getters

    public double getTotalCharges() {
        return pharmacyCharges + doctorFee + roomCharges;
    }

    public double getPharmacyCharges() {
        return pharmacyCharges;
    }

    public void setPharmacyCharges(double pharmacyCharges) {
        this.pharmacyCharges = pharmacyCharges;
    }

    public double getDoctorFee() {
        return doctorFee;
    }

    public void setDoctorFee(double doctorFee) {
        this.doctorFee = doctorFee;
    }

    public double getRoomCharges() {
        return roomCharges;
    }

    public void setRoomCharges(double roomCharges) {
        this.roomCharges = roomCharges;
    }

    // Override toString to make it look nice
    @Override
    public String toString() {
        double totalCharges = pharmacyCharges + doctorFee + roomCharges;
        int dollars = (int) totalCharges;
        int cents = (int) ((totalCharges - dollars) * 100);
        String totalCost = dollars + "." + cents;
        return "Bill Information:\n-----------------" +
                "\nPatient Name: " + patient.getFirstName() + " " + patient.getLastName() +
                "\nPatient ID: " + patient.getPatientID() +
                "\nPharmacy Charges: $" + pharmacyCharges +
                "\nDoctor's Fee: $" + doctorFee +
                "\nRoom Charges: $" + roomCharges +
                "\n-----------------\nTotal Charges: $" + totalCost;
    }
}
