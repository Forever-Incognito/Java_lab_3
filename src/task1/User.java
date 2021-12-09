package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private Address address = new Address();
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String password;

    //Constructors
    public User(final String street, final int numberOfHouse, final String firstName, final String lastName, final String email, final int age, final String password) {
        this.address.setStreet(street);
        this.address.setNumberOfHouse(numberOfHouse);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.password = password;

        validate();
    }

    //Getters:

    public Address getAddress() {
        return address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    //Setters:

    public void setAddress(final Address address) {
        this.address = address;
        validate();
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
        validate();
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
        validate();
    }

    public void setEmail(final String email) {
        this.email = email;
        validate();
    }

    public void setAge(final int age) {
        this.age = age;
        validate();
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public void validate() {
        final List<String> exceptionsMessages = new ArrayList<>();

        if (getAddress().getStreet().contains(" ") || getAddress().getStreet().matches("(.*)\\d+(.*)")) {
            exceptionsMessages.add("Name of street can't have numbers or spaces");
        }

        if (getAddress().getNumberOfHouse() < 1 || getAddress().getNumberOfHouse() > 1000) {
            exceptionsMessages.add("Number of house must be in in range from 1 to 1000");
        }

        if (getFirstName().contains(" ") || getFirstName().matches("(.*)\\d+(.*)")) {
            exceptionsMessages.add("Firstname can't have numbers or spaces");
        }

        if (getLastName().contains(" ") || getLastName().matches("(.*)\\d+(.*)")) {
            exceptionsMessages.add("Lastname can't have numbers or spaces");
        }

        if (getEmail().contains(" ") || !getEmail().matches("[a-zA-Z0-9]{3,14}@gmail.com")) {
            exceptionsMessages.add("Email must end with '@gmail.com' and have at least 3 signs");
        }

        if (getAge() < 18) {
            exceptionsMessages.add("User must be at least 18 years old");
        }

        if (!exceptionsMessages.isEmpty()) {
            throw new UncheckedException(exceptionsMessages, ErrorCode.ERROR_400);
        }
    }

    @Override
    public boolean equals(final Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final User user = (User) o;
        return age == user.age && Objects.equals(address, user.address) && Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) && Objects.equals(email, user.email) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, firstName, lastName, email, age, password);
    }

    @Override
    public String toString() {
        return "User information:" + '\n' +
                "Firstname: " + getFirstName() + '\n' +
                "Lastname: " + getLastName() + '\n' +
                getAddress().toString() + '\n' +
                "Age: " + getAge() + '\n' +
                "Email: " + getEmail() + '\n' +
                "Password: " + getPassword();
    }
}
