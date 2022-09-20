public class Billing {

    private Patient patient;
    private Doctor physician;
    private double amount;

    public Billing()
    {
        patient = new Patient();
        physician = new Doctor();
        amount = 0;
    }


    public Billing(Patient thePatient, Doctor thePhysician, double amount)
    {
        patient = thePatient;
        physician = thePhysician;
        amount = amount;
    }

    public void setPatient(Patient newPatient)
    {
        patient = newPatient;
    }

    public void setPhysician(Doctor newPhysician)
    {
        physician = newPhysician;
    }

    public void setamount(double newAmount)
    {
        amount = newAmount;
    }

    public Patient getPatient()
    {
        return patient;
    }

    public Doctor getPhysician()
    {
        return physician;
    }

    public double getamount()
    {
        return amount;
    }

    public String toString()
    {
        return "\nPatient: " + patient.toString() + "\nDoctor: " + physician.getName() +
                "\nAmount Due: $" + amount;
    }
    public boolean equals(Billing other)
    {
        return patient.equals(other.patient) && physician.equals(other.physician) && amount == other.amount;
    }
}
