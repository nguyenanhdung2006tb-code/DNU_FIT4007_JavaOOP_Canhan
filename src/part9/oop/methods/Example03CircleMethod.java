package part9.oop.methods;

public class Example03CircleMethod {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(7.5);

        System.out.println("Hình tròn 1: " + c1);
        System.out.println("Diện tích: " + c1.getArea());
        System.out.println("Chu vi: " + c1.getPerimeter());

        System.out.println("\nHình tròn 2: " + c2);
        System.out.println("Diện tích: " + c2.getArea());
        System.out.println("Chu vi: " + c2.getPerimeter());
    }
}
