import java.util.Date;

public class Employee extends Person {

    private String name;
    Date hireDate = new Date( );
    String str = String.format("Current Date/Time : %tc", hireDate );

    public Employee() {

    }

    public Employee (String name, Date hireDate) {
        name = this.name;
        hireDate = this.hireDate;
    }

    public Employee (Employee object) {
        this.name = object.name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
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

    public boolean equals(Employee other) {
        return this.hireDate.equals(other.hireDate) && this.name.equals(other.name);
    }
}







