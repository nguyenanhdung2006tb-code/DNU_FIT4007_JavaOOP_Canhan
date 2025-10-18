package part8.oop.constructor;

public class Circle {
    // Thuộc tính
    private double radius;

    // Constructor mặc định
    public Circle() {
        this.radius = 0.0;
    }

    // Constructor có tham số
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // toString()
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
