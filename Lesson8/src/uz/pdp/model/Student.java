package uz.pdp.model;

import java.util.ArrayList;
import java.util.List;
public class Student implements Cloneable{
    private String fullName;
    private int birthYear;
    private List<String> hobbies;
    private Address address;
    public Student() {
    }
//
//    public Student(String fullName, int birthYear) {
//        this.fullName = fullName;
//        this.birthYear = birthYear;
//    }
    public Student(Student student) {

        this.fullName=student.getFullName();
        this.birthYear=student.getBirthYear();
        this.hobbies=student.getHobbies();
    }

    public Student(String fullName, int birthYear, List<String> hobbies) {
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.hobbies = hobbies;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
       Student student=new Student();
       student.setFullName(this.fullName);
       student.setBirthYear(this.birthYear);
       List<String> strings=new ArrayList<>(this.hobbies);
       student.setHobbies(strings);
       student.setAddress((Address) this.address.clone());
       return student;
    };

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", birthYear=" + birthYear +
                ", hobbies=" + hobbies +
                ", address=" + address +
                '}';
    }
}
