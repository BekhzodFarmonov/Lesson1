package uz.pdp;

import uz.pdp.model.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("View of Empty Object");
        List<Integer> integers = new ArrayList<>();
        List<Integer> integers1 = Collections.EMPTY_LIST;
        System.out.println("integers = " + integers);
        System.out.println("integers1 = " + integers1);
        List<String> strings = new ArrayList<>();
        List<String> strings1 = Collections.emptyList();

        Student student = new Student("A", 2000, strings1);
        Student student1 = new Student("B", 2001, strings1);

        System.out.println("View of Single Object");
        List<Integer> integerList = Collections.singletonList(45);
        Set<Integer> integerSet=Collections.singleton(54);
        Map<String, Integer> integerMap=Collections.singletonMap("bir",1);

//        integerList.set(0,65);

        List<Student> students=Collections.singletonList(student);
        students.get(0).setFullName("ABCD");
        System.out.println(students);
        System.out.println("View of an array ");
        List<Integer> list=Arrays.asList(4,5,6,7,8);
        list.set(0,56);
        System.out.println("list = " + list);
        List<Integer> list1=List.of(1,4,5,6,8);
//        list1.set(0,45);
        System.out.println("View of a portion of a collection");
        List<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        List<Integer> subList=list2.subList(0,3);
        subList.add(0,656);
        System.out.println("list1 = " + list1);
        System.out.println("subList = " + subList);
        List<Integer> subList1=Collections.nCopies(7,45);
//        subList1.set(0,4556);
        System.out.println(subList1);
        System.out.println("Unmodifiable views");
        List<Integer> unmodifiableList=Collections.unmodifiableList(list2);
        unmodifiableList.remove(0);
        System.out.println(unmodifiableList);



    }
}
