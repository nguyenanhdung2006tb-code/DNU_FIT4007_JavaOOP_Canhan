package part11.oop.inheritance;

public class Example03 {
    public static void main(String[] args) {
        Student s = new Student();
        s.input();
        System.out.println(s);

        System.out.println("Is at least 18? " + s.checkAge(18));
        System.out.println("Upper name: " + s.getUpperName());
        System.out.println("StudentId starts with 23IT? " + s.checkStudentId());
    }
}
