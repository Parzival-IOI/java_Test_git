import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    }
}

class Person {
    private String name;
    private String address;
    Person() {}
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

class Student extends Person {
    private String course;
    private int number_course;
    private String grade;

    Student(String name, String address, int number_course) {
        super(name, address);
        this.number_course = number_course;
    }

    public void addCoureGrade(String course, String grade) {

    }

}