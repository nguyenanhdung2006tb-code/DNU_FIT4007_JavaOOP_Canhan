package part9.oop.methods;

public class Circle {
    private double radius;

    // Constructor mặc định
    public Circle() {
    }

    // Constructor có tham số
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter và Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Phương thức tính chu vi
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
