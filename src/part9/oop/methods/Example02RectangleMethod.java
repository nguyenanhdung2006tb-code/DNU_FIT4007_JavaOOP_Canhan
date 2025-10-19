package part9.oop.methods;

public class Example02RectangleMethod {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.0, 5.0);
        Rectangle r2 = new Rectangle(4.0, 6.0);

        System.out.println("Hình chữ nhật 1: " + r1);
        System.out.println("Diện tích: " + r1.getArea());
        System.out.println("Chu vi: " + r1.getPerimeter());
        System.out.println("Có phải hình vuông không? " + r1.isSquare());

        System.out.println("\nHình chữ nhật 2: " + r2);
        System.out.println("Diện tích: " + r2.getArea());
        System.out.println("Chu vi: " + r2.getPerimeter());
        System.out.println("Có phải hình vuông không? " + r2.isSquare());
    }
}
