package part13.oop.abstraction;

public class Example02StudentManagement {
    public static void main(String[] args) {
        System.out.println("=== Sinh viên IT ===");
        StudentIT it = new StudentIT();
        it.input();
        System.out.println(it);

        System.out.println("\n=== Sinh viên BA ===");
        StudentBA ba = new StudentBA();
        ba.input();
        System.out.println(ba);
    }
}
