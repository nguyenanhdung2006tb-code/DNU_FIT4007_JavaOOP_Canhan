package part8.oop.constructor;

public class Example03CircleTest {
    public static void main(String[] args) {
        // Dùng constructor mặc định
        Circle c1 = new Circle();
        System.out.println(c1);

        // Dùng constructor có tham số
        Circle c2 = new Circle(5.5);
        System.out.println(c2);

        // Sửa bán kính
        c2.setRadius(10);
        System.out.println("Radius after update: " + c2.getRadius());
        System.out.println(c2);
    }
}
