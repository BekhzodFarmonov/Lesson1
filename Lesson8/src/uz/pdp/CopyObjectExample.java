package uz.pdp;

import uz.pdp.model.Address;
import uz.pdp.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyObjectExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> strings1 =new  ArrayList<>();
        Student student = new Student("A", 2000, strings1);
        Address aaaaa = new Address("Aaaaa", "1223");
        student.setAddress(aaaaa);
        Student student1 =new Student(student);
        student.setFullName("asasas");
        System.out.println("student = " + student);
        System.out.println("student1 = " + student1);
        String[] strings={"A","b","c"};
        String[] copyStrings=strings.clone();
        System.out.println("strings = " + Arrays.toString(strings));
        System.out.println("copyStrings = " + Arrays.toString(copyStrings));
        Student student2=(Student) student.clone();
//        strings1.add("sdasdasdasda");
        aaaaa.setHomeNumber("4444");
        System.out.println("student = " + student);
        System.out.println("student2 = " + student2);

    }
}
