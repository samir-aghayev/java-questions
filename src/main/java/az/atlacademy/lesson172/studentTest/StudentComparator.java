package az.atlacademy.lesson172.studentTest;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.grade != student2.grade) {
            return Double.compare(student2.grade, student1.grade);
        } else if (!student1.name.equals(student2.name)) {
            return student1.name.compareTo(student2.name);
        }
        return student1.compareTo(student2);
    }
}
