
public class Main {
    public static void main(String args[]) {
       Doctor p1 = new Doctor();
            p1.setName("Bob");
            p1.setSalary(34000.0);
            p1.setSpeciality("Pediatrist");
            p1.setVisitFee(10.5);

       Doctor p2 = new Doctor ();
            p2.setName("Susan");
            p2.setSalary(45000.0);
            p2.setSpeciality("Surgeon");
            p2.setVisitFee(150.5);

       Doctor p3 = new Doctor();
            p3.setName("Lilly");
            p3.setSalary(290000.0);
            p3.setSpeciality("kidney");
            p3.setVisitFee(95.5);

       Patient p4 = new Patient();
            p4.setName("Fred");
            p4.setDoctor("Bob");
       Patient p5 = new Patient();
            p5.setName("Sally");
            p5.setDoctor("Susan");
       Patient p6 = new Patient();
            p6.setName("John");
            p6.setDoctor("Lilly");

       Billing p7 = new Billing ();
            p7.setamount(21.0);
        Billing p8 = new Billing ();
            p8.setamount(150.5);
        Billing p9 = new Billing ();
            p9.setamount(170.0);

    System.out.println("The doctor" + " " + p1.getName() + " " + "was hired on" + " " + p1.getHireDate() + " " + "at Salary" + " " + p1.getSalary() + ".");
        System.out.println("The speciality is " + p1.getSpeciality() +  " " + "and visit fee is" + " " + "$" + p1.getVisitFee() + ".");
    System.out.println("The doctor" + " " + p2.getName() + " " + "was hired on" + " " + p2.getHireDate() + " " + "at Salary" + " " + p2.getSalary() + ".");
        System.out.println("The speciality is " + p2.getSpeciality() +  " " + "and visit fee is" + " " + "$" + p2.getVisitFee() + ".");
    System.out.println("The doctor" + " " + p3.getName() + " " + "was hired on" + " " + p3.getHireDate() + " " + "at Salary" + " " + p3.getSalary() + ".");
        System.out.println("The speciality is " + p3.getSpeciality() +  " " + "and visit fee is" + " " + "$" + p3.getVisitFee() + ".");

    System.out.println("\n");

    System.out.println("*Patient's Information");
    System.out.println("The name is: " + p4.getName() +  "," +" " + "Primary doctor is:" + " " + p4.getDoctor());
    System.out.println("The name is: " + p5.getName() +  "," +" " + "Primary doctor is:" + " " + p5.getDoctor());
    System.out.println("The name is: " + p6.getName() +  "," +" " + "Primary doctor is:" + " " + p6.getDoctor());

    System.out.println("\n");

    System.out.println("*Billing's Information");
    System.out.println("Patient: " + " " + p4.getName() + "\n" + "Doctor:" + " " + p4.getDoctor() +"\n" + "Amount Due:" + " " + "$" + p7.getamount() );
    System.out.println("Patient: " + " " + p5.getName() + "\n" + "Doctor:" + " " + p5.getDoctor() + "\n" +"Amount Due:" + " " + "$" + p8.getamount());
    System.out.println("Patient: " + " " + p6.getName() + "\n" + "Doctor:" + " " + p6.getDoctor() + "\n" + "Amount Due:" + " " + "$" + p9.getamount());

    System.out.println("\n");

    System.out.println("The total income from billing records is:" + " " + (p7.getamount() + p8.getamount() + p9.getamount()));

    }
}
