package task1;

import java.util.Objects;

public class Address {
    private String street;
    private int numberOfHouse;

    public Address(){

    }

    public Address(final String street, final int numberOfHouse) {
        this.street = street;
        this.numberOfHouse = numberOfHouse;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(final int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Address address = (Address) o;
        return numberOfHouse == address.numberOfHouse && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, numberOfHouse);
    }

    @Override
    public String toString() {
        return "Address: " + getStreet() + " " + getNumberOfHouse();
    }
}
