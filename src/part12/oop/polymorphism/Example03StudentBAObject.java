package part12.oop.polymorphism;

public class Example03StudentBAObject {
    public static void main(String[] args) {
        System.out.println("=== Enter BA Student Information ===");
        StudentBA student = new StudentBA();
        student.input();

        System.out.println("\n=== Student Information ===");
        System.out.println(student);

        System.out.println("\n=== Copy of Student ===");
        StudentBA copy = student.copyObject();
        System.out.println(copy);
    }
}
