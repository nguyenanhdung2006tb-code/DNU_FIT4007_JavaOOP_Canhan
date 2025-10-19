package part9.oop.methods;

public class Rectangle {
    private double width;
    private double height;

    // Constructor mặc định
    public Rectangle() {
    }

    // Constructor có tham số
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getter và Setter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return width * height;
    }

    // Phương thức tính chu vi
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Phương thức kiểm tra hình vuông
    public boolean isSquare() {
        return width == height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
