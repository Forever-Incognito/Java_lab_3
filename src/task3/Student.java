package task3;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Student {
    private String name;
    private String surname;
    private int course;
    private int id;
    private static int count = 1;
    private Specialty specialty;
    private List<Subject> subjects;
    private List<Marks> marksOfSubjects;

    //Construction
    public Student(String name, String surname, int course, Specialty specialty, List<Subject> subjects, List<Marks> marksOfSubjects) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.id = count++;
        this.specialty = specialty;
        this.subjects = subjects;
        this.marksOfSubjects = marksOfSubjects;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCourse() {
        return course;
    }

    public int getId() {
        return id;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public List<Marks> getMarksOfSubjects() {
        return marksOfSubjects;
    }

    //Setters
    public void setName(final String name) {
        this.name = name;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public void setCourse(final int course) {
        this.course = course;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSpecialty(final Specialty specialty) {
        this.specialty = specialty;
    }

    public void setSubjects(final List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void setMarksOfSubjects(final List<Marks> marksOfSubjects) {
        this.marksOfSubjects = marksOfSubjects;
    }

    public void addSubject(final Subject subject) {
        this.getSubjects().add(subject);
    }

    public void addMarks() {
        final int num = ((int) (Math.random() * (12 - 1) + 1));
        final Marks marks = new Marks(num);
        this.getMarksOfSubjects().add(marks);
    }

    public void printMarks() {
        System.out.println(this.getMarksOfSubjects());
    }

    public void printMap(final Subject subject) {
        final Map<Integer, Marks> studentMap = new TreeMap<>();
        final int indexOfMark = this.getSubjects().indexOf(subject);
        studentMap.put(this.getId(), this.getMarksOfSubjects().get(indexOfMark));
        System.out.println(studentMap);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Student student = (Student) o;
        return getCourse() == student.getCourse() && getId() == student.getId() && Objects.equals(getName(), student.getName())
                && Objects.equals(getSurname(), student.getSurname()) && getSpecialty() == student.getSpecialty()
                && Objects.equals(getSubjects(), student.getSubjects()) && Objects.equals(getMarksOfSubjects(), student.getMarksOfSubjects());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getCourse(), getId(), getSpecialty(), getSubjects(), getMarksOfSubjects());
    }

    @Override
    public String toString() {
        return "Student{" + '\n' +
                "Name: " + getName() + '\n' +
                "Surname: " + getSurname() + '\n' +
                "Course: " + getCourse() + '\n' +
                "Id card: " + getId() + '\n' +
                "Specialty: " + getSpecialty() + '\n' +
                getSubjects().toString() + '\n' +
                getMarksOfSubjects().toString() + '\n' +
                "}";
    }
}