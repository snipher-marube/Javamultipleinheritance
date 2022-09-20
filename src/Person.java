public class Person {
    private String name;

    public Person() {

    }

    public Person (String name) {

        name = this.name;
    }

    public Person (Person object) {

        this.name = object.name;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {

        return super.toString();
    }
    public boolean equals(Person other) {

        return this.name.equals(other.name);
    }
}
