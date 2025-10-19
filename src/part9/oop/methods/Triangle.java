package part9.oop.methods;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    // Constructor mặc định
    public Triangle() {
    }

    // Constructor có tham số
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Getter và Setter
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    // Phương thức set() thay đổi 3 cạnh cùng lúc
    public void set(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Phương thức tính chu vi
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    // Phương thức tính diện tích theo công thức Heron
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    // Kiểm tra tam giác đều
    public boolean isEquilateralTriangle() {
        return sideA == sideB && sideB == sideC;
    }

    // Kiểm tra tam giác cân
    public boolean isIsoscelesTriangle() {
        return sideA == sideB || sideA == sideC || sideB == sideC;
    }

    // Kiểm tra tam giác vuông (định lý Pythagoras)
    public boolean isRightTriangle() {
        double a2 = sideA * sideA;
        double b2 = sideB * sideB;
        double c2 = sideC * sideC;
        return Math.abs(a2 + b2 - c2) < 1e-6 ||
                Math.abs(a2 + c2 - b2) < 1e-6 ||
                Math.abs(b2 + c2 - a2) < 1e-6;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
