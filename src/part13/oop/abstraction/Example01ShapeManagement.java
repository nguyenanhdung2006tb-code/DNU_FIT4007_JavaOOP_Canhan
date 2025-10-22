package part13.oop.abstraction;

public class Example01ShapeManagement {
    public static void main(String[] args) {
        System.out.println("=== HÌNH TAM GIÁC ===");
        Triangle triangle = new Triangle();
        triangle.input();
        System.out.println(triangle.toString());

        System.out.println("\n=== HÌNH CHỮ NHẬT ===");
        Rectangle rectangle = new Rectangle();
        rectangle.input();
        System.out.println(rectangle.toString());
    }
}
