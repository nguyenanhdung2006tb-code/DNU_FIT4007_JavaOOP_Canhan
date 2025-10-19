package part9.oop.methods;

import java.time.LocalDate;

public class Car {
    private String color;
    private String name;
    private int seatingCapacity;
    private int year;

    // Constructor mặc định
    public Car() {
    }

    // Constructor có tham số
    public Car(String color, String name, int seatingCapacity, int year) {
        this.color = color;
        this.name = name;
        this.seatingCapacity = seatingCapacity;
        this.year = year;
    }

    // Getter và Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Phương thức tính tuổi của xe
    public int getAge() {
        int currentYear = LocalDate.now().getYear();
        return currentYear - year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                ", year=" + year +
                '}';
    }
}
