package part8.oop.constructor;

public class Example05SquareManagement {
    public static void main(String[] args) {
        // Tạo đối tượng bằng constructor mặc định
        Square s1 = new Square();
        s1.setSide(5.0);

        // Tạo đối tượng bằng constructor có tham số
        Square s2 = new Square(7.5);

        // In thông tin hình vuông
        System.out.println(s1);
        System.out.println(s2);
    }
}
