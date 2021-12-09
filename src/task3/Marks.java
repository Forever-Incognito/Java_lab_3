package task3;

import java.util.Objects;

public class Marks {
    private int marks;

    public Marks() {

    }

    public Marks(final int mark) {
        this.marks = mark;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(final int marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Marks marks1 = (Marks) o;
        return getMarks() == marks1.getMarks();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMarks());
    }

    @Override
    public String toString() {
        return "Marks: " + getMarks();
    }
}
