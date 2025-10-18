package part8.oop.constructor;

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

    // toString()
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
