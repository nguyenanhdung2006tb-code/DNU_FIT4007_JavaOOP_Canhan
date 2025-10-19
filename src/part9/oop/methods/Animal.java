package part9.oop.methods;

import java.time.LocalDate;

public class Animal {
    private String name;
    private String color;
    private int age;

    // Constructor mặc định
    public Animal() {
    }

    // Constructor có tham số
    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Phương thức lấy năm sinh
    public int getYearOfBirth() {
        int currentYear = LocalDate.now().getYear();
        return currentYear - age;
    }

    // Kiểm tra 2 động vật có cùng màu không
    public boolean equalsColor(Animal a) {
        return this.color != null && this.color.equalsIgnoreCase(a.color);
    }

    // Tăng tuổi động vật lên 1
    public void increaseAge() {
        this.age += 1;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
