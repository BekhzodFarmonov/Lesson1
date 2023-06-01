package uz.pdp;

import uz.pdp.model.Student;
import uz.pdp.model.StudentIteratorByYear;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("A", 2000, Collections.EMPTY_LIST));
        students.add(new Student("B", 1998, Collections.EMPTY_LIST));
        students.add(new Student("C", 2001, Collections.EMPTY_LIST));
        students.add(new Student("D", 1997, Collections.EMPTY_LIST));
        students.add(new Student("E", 1996, Collections.EMPTY_LIST));

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student nextStudent=iterator.next();
            if (nextStudent.getBirthYear()<2000)
            System.out.println(nextStudent);
                iterator.remove();
        }
        System.out.println("==============================");
        StudentIteratorByYear iteratorByYear = new StudentIteratorByYear(students, 2000);
        while (iteratorByYear.hasNext()) {
            System.out.println(iteratorByYear.next());
        }
        List<Student> list = new CopyOnWriteArrayList<>(students);
        Iterator<Student> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
//            Student student = iterator1.next();
//            if (student.getBirthYear() != 2000)
//                iterator1.remove();
//            else
//                System.out.println(student);
            iterator1.next();
            iterator1.remove();
        }
        System.out.println(list);
    }
}
