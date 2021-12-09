package task3;

import java.util.Objects;

public class Subject {
    private String nameOfSubject;

    public Subject(final String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }

    public void setNameOfSubject(final String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Subject subject = (Subject) o;
        return Objects.equals(getNameOfSubject(), subject.getNameOfSubject());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfSubject());
    }

    @Override
    public String toString() {
        return "Subject: " + getNameOfSubject();
    }
}
