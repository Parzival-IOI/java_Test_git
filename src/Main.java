import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Student stu;

        stu = new Student("Parzival", "IOI", 3);

        try {
            stu.addCourseGrade("Spring Boot", "A");
            stu.addCourseGrade("Laravel", "A");
            stu.addCourseGrade("Next JS", "A");
            stu.addCourseGrade(".Net", "A");
        }
        catch (Exception ex) {
            System.out.println("Error : " + ex.getMessage());
        }

        stu.printGrade();

        scan.close();
    }
}

class Person {
    protected String name;
    protected String address;
    Person() {}
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

class Student extends Person {
    private String[] course;
    private int number_course;
    private String[] grade;

    Student(String name, String address, int number_course) {
        super(name, address);
        this.number_course = number_course;
        course = new String[number_course];
        grade = new String[number_course];
    }

    public void addCourseGrade(String course, String grade) throws Exception {
        if (number_course >= 0) {
            throw new Exception("Subject is Max");
        }

        this.course[(number_course-1)] = course;
        this.grade[(number_course-1)] = grade;

        number_course -= 1;
    }

    public void printGrade() {
        System.out.println("Name : " + name);
        System.out.println("Address : "+ address);
        System.out.println("Course Number : " + number_course);
        for (int i = 0; i < number_course; i++) {
            System.out.println("Course " + (i+1) + " : " + course[i]);
            System.out.println("Grade " + (i+1) + " : " + grade[i]);
        }
    }

}