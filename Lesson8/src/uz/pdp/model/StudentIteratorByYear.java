package uz.pdp.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentIteratorByYear implements Iterator<Student> {
    List<Student> students;
    private int counter = 0;
    Student nextStudent = null;
    private int year;
    public StudentIteratorByYear(List<Student> students, int year) {
        this.year = year;
        this.students = students;
    }
    @Override
    public boolean hasNext() {
        nextStudent = null;
        while (counter < students.size()) {
            if (students.get(counter).getBirthYear() < year) {
                nextStudent = students.get(counter);
                counter++;
                break;
            }
            counter++;
        }
        return nextStudent != null;
    }
    @Override
    public Student next() {
        return nextStudent;
    }
}
