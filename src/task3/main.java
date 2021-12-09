package task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(final String[] args) {
        final List<Subject> subjectList = new ArrayList<>();

        final Subject english = new Subject("English");
        final Subject mathematics = new Subject("Mathematics");
        final Subject physics = new Subject("Physics");
        final Subject geography = new Subject("Geography");

        subjectList.add(mathematics);
        subjectList.add(physics);
        subjectList.add(english);
        subjectList.add(geography);

        System.out.println(subjectList);

        final List<Student> studentList = new ArrayList<>();

        final Student student1 = new Student("Андрій", "Маковський", 2, Specialty.IT, subjectList, randomize(subjectList));
        final Student student2 = new Student("Олександ", "Михайлов", 4, Specialty.SA, subjectList, randomize(subjectList));
        final Student student3 = new Student("Максим", "Данилюк", 8, Specialty.SE, subjectList, randomize(subjectList));
        final Student student4 = new Student("Артем", "Турко", 2, Specialty.IT, subjectList, randomize(subjectList));

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        System.out.println(studentList);

        System.out.println(casting(studentList));

        System.out.println(deleteAver(studentList));

        System.out.println(sorting(studentList));

        System.out.println(addLineToSurname(studentList));

        System.out.println(printMarks(studentList, english));

        System.out.println(findBest(studentList));
    }

    public static List<StudentSimple> casting(final List<Student> studentList) {
        return studentList.stream()
                .map(student -> new StudentSimple(student.getName(), student.getSurname(), student.getId()))
                .collect(Collectors.toList());
    }

    public static List<Student> deleteAver(final List<Student> studentList) {
        return studentList.stream()
                .filter(student -> (student.getMarksOfSubjects().stream()
                        .mapToInt(Marks::getMarks)).average().orElse(0) > 3)
                .collect(Collectors.toList());
    }

    public static List<Marks> printMarks(final List<Student> studentList, final Subject subject) {
        return studentList.stream()
                .map(student -> student.getMarksOfSubjects().get((student.getSubjects().stream()
                        .map(Subject::getNameOfSubject)
                        .collect(Collectors.toList()).indexOf(subject.getNameOfSubject()))))
                .collect(Collectors.toList());
    }

    public static List<Student> sorting(final List<Student> studentList) {
        return studentList.stream()
                .sorted(Comparator.comparing(Student::getName).
                        thenComparing(Student::getSurname))
                .collect(Collectors.toList());
    }

    public static Student findBest(final List<Student> studentList) {
        return studentList.stream()
                .max(Comparator.comparingDouble(student -> student.getMarksOfSubjects().stream()
                        .mapToInt(Marks::getMarks).average().getAsDouble()))
                .get();
    }

    public static List<String> addLineToSurname(final List<Student> studentList) {
        return studentList.stream()
                .map(Student::getSurname)
                .reduce((a, b) -> a + "-" + b)
                .stream().toList();
    }

    public static List<Marks> randomize(final List<Subject> subjectList) {
        return subjectList.stream()
                .map(subject -> new Marks((int) (Math.random() * (12 - 1) + 1)))
                .collect(Collectors.toList());
    }
}
