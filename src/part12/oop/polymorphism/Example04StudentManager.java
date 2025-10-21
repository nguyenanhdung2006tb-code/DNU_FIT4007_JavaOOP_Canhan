package part12.oop.polymorphism;

import java.util.ArrayList;

public class Example04StudentManager {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // Thêm sinh viên IT
        StudentIT it1 = new StudentIT("IT001", "Dũng", 20, 8.5f, 9.0f);
        StudentIT it2 = new StudentIT("IT002", "Lan", 19, 6.5f, 7.0f);

        // Thêm sinh viên BA
        StudentBA ba1 = new StudentBA("BA001", "Minh", 21, 8.0f, 7.5f);

        manager.addStudent(it1);
        manager.addStudent(it2);
        manager.addStudent(ba1);

        System.out.println("=== All Students ===");
        manager.showStudents();

        System.out.println("\n=== Sort by Score ===");
        manager.sortByScore();
        manager.showStudents();

        System.out.println("\n=== Sort by Type ===");
        manager.sortByType();
        manager.showStudents();

        System.out.println("\n=== Search Student IT001 ===");
        System.out.println(manager.searchStudent("IT001"));
    }
}
