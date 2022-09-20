import java.util.Date;

public class SalariedEmployee extends Employee{
    private String name;
    private double salary;
    Date hireDate = new Date( );
    String str = String.format("Current Date/Time : %tc", hireDate );

    public SalariedEmployee() {

    }

    public SalariedEmployee(String name, Date hireDate, double salary) {
        name = this.name;
        hireDate = this.hireDate;
        salary = this.salary;
    }

    public SalariedEmployee (SalariedEmployee object) {
        this.name = object.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }


    public String toString() {
        return super.toString();
    }

    public boolean equals(SalariedEmployee other) {
        return this.name.equals(other.name) && this.salary == other.salary && this.hireDate.equals(other.hireDate) ;
    }
}


