public class Doctor extends Person {
    private String speciality;
    private Person person;

    Doctor() {
        super();
        speciality = "";
        person = new Person(); 
    }

    Doctor(Person person, String speciality) {
        super();
        this.person = person;
        this.speciality = speciality;
    }
    public String getSpeciality() {
        return speciality;
    }
    // public void setSpeciality(String speciality) {
    //     this.speciality = speciality;
    // }
    public String getFirstName() {
        return person.getFirstName();
    }
    public String getLastName() {
        return person.getFirstName();
    }

    @Override
    public String toString() {
        return "Doctor Information: " +
                "\nFirst Name: " + person.getFirstName() + 
                "\nLast Name: " + person.getLastName() +
                "\nSpeciality: " + speciality;
    }
}
