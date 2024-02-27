public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String number;
    private Double height;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String address, String number, Double height) {
        this(firstName, lastName, age);
        this.address = address;
        this.number = number;
        this.height = height;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
