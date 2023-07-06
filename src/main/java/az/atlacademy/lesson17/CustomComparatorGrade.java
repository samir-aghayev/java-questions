package az.atlacademy.lesson17;

import java.util.Comparator;

public class CustomComparatorGrade implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {

        return 0;//Integer.compare(student2.getGrade(), student1.getGrade());
    }
}
