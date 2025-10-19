package part9.oop.methods;

public class Square {
    private double side;

    // Constructor mặc định
    public Square() {
    }

    // Constructor có tham số
    public Square(double side) {
        this.side = side;
    }

    // Getter và Setter
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // Tính chu vi hình vuông
    public double getPerimeter() {
        return 4 * side;
    }

    // Tính diện tích hình vuông
    public double getArea() {
        return side * side;
    }

    // Kiểm tra cạnh có phải là số nguyên hay không
    public boolean isIntegerSquareSide() {
        // Kiểm tra nếu phần thập phân = 0
        return Math.abs(side - Math.round(side)) < 1e-9;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
