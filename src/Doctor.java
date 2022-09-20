public class Doctor extends SalariedEmployee{
    private String speciality;
    private double visitFee;

    public Doctor() {

    }

    public Doctor(String speciality, double visitFee) {
       speciality = this.speciality;
       visitFee = this.visitFee;
    }

    public Doctor (Doctor object) {
        this.setName(object.getName());
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public double getVisitFee() {
        return visitFee;
    }

    public void setVisitFee(double visitFee) {
        this.visitFee = visitFee;
    }

    public String toString() {

        return speciality;
    }

    public boolean equals(Doctor other) {
        return this.speciality.equals(other.speciality) && this.visitFee == other.visitFee;
    }
}
