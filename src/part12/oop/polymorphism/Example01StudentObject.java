package part12.oop.polymorphism;

import java.util.Scanner;

class Student {
    private String studentID;
    private String name;
    private int age;

    // Constructor mặc định
    public Student() {}

    // Constructor có tham số
    public Student(String studentID, String name, int age) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
    }

    // Getter và Setter
    public String getStudentID() { return studentID; }
    public void setStudentID(String studentID) { this.studentID = studentID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // Phương thức nhập dữ liệu
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        studentID = sc.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = sc.nextInt();
    }

    // Tăng/giảm tuổi
    public void incAge() { age++; }
    public void decAge() { age--; }
    public void incAge(int n) { age += n; }
    public void decAge(int n) { age -= n; }

    // Copy đối tượng
    public Student copyObject() {
        return new Student(studentID, name, age);
    }

    // Kiểm tra bằng equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student s = (Student) obj;
        return studentID.equalsIgnoreCase(s.studentID);
    }

    // toString
    @Override
    public String toString() {
        return "StudentID: " + studentID + ", Name: " + name + ", Age: " + age;
    }
}

public class Example01StudentObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input();

        Student s2 = s1.copyObject();
        s2.incAge();

        System.out.println("\n--- Thông tin sinh viên 1 ---");
        System.out.println(s1);

        System.out.println("\n--- Thông tin sinh viên 2 (copy + tăng tuổi) ---");
        System.out.println(s2);

        System.out.println("\nHai sinh viên có cùng mã? " + s1.equals(s2));
    }
}
