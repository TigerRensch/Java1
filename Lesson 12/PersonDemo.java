/*
 * Course: CIS263AA Java Programming: Level 2
 * Lesson 1 (Chapter 10)
 * Exercise 1
 */


public class PersonDemo {

    public static void main(String[] args) {


        Student student = new Student();

        student.setAge(17);
        student.setName("John");
        student.setStudentId(2222);

        int age = student.getAge();
        String name = student.getName();
        int studentId = student.getStudentId();


        System.out.println("The student name is " + name + ", the age is " + age + " , and student id is " + studentId + ". ");

    }

}
