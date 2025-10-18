package part8.oop.constructor;

public class Example02RectangleManagement {
    public static void main(String[] args) {
        // Tạo đối tượng bằng constructor mặc định
        Rectangle r1 = new Rectangle();
        r1.setWidth(5.0);
        r1.setHeight(3.0);

        // Tạo đối tượng bằng constructor có tham số
        Rectangle r2 = new Rectangle(10.0, 4.5);

        // In thông tin
        System.out.println(r1);
        System.out.println(r2);
    }
}
