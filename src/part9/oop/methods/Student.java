package part9.oop.methods;

import java.time.Year;

public class Student {
    private String masv;
    private String name;
    private int age;

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

    // Phương thức lấy năm sinh
    public int getYearOfBirth() {
        int currentYear = Year.now().getValue();
        return currentYear - age;
    }

    // Phương thức trả về tên in hoa
    public String getUpperName() {
        return name.toUpperCase();
    }

    @Override
    public String toString() {
        return "Student{" +
                "masv='" + masv + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
