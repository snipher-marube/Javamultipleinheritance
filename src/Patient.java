public class Patient extends Person{
    private  String Doctor;

    public Patient()
    {

    }

    public Patient(String Doctor)
    {
       Doctor=this.Doctor;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String doctor) {
        Doctor = doctor;
    }

    public String toString()
    {
        return Doctor;
    }

    public boolean equals(Patient other)
    {
        return Doctor.equals(other.Doctor);
    }
}
