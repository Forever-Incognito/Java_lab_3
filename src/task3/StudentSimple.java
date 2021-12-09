package task3;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public class StudentSimple {
    private String firstName;
    private String lastName;
    private int id;
    private static final int count = 1;

    //Constructors
    public StudentSimple(final String firstName, final String lastName, final int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    //Getters:
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    //Setters:
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public void setId(final int id) {
        this.id = id;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final StudentSimple that = (StudentSimple) o;
        return id == that.id && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id);
    }

    @Override
    public String toString() {
        return "Student{" + '\n' +
                "ID: " + getId() + '\n' +
                "Last name: " + getLastName() + '\n' +
                "Name: " + getFirstName() + '\n';
    }
}
