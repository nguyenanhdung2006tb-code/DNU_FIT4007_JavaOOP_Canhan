package part13.oop.abstraction;

import java.util.Scanner;

public abstract class Student {
    protected String masv;
    protected String name;
    protected int age;

    // Constructor mặc định
    public Student() {
    }

    // Constructor có tham số
    public Student(String masv, String name, int age) {
        this.masv = masv;
        this.name = name;
        this.age = age;
    }

    // Getter và Setter
    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Phương thức nhập thông tin
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        masv = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = sc.nextInt();
    }

    // Phương thức trừu tượng
    public abstract float calculateAverage();

    @Override
    public abstract String toString();
}
