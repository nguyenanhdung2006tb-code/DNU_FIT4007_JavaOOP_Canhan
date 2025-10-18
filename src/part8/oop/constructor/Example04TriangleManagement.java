package part8.oop.constructor;

public class Example04TriangleManagement {
    public static void main(String[] args) {
        // Tạo đối tượng bằng constructor mặc định
        Triangle t1 = new Triangle();
        t1.setSideA(3.0);
        t1.setSideB(4.0);
        t1.setSideC(5.0);

        // Tạo đối tượng bằng constructor có tham số
        Triangle t2 = new Triangle(2.5, 3.5, 4.0);

        // In thông tin tam giác
        System.out.println(t1);
        System.out.println(t2);
    }
}
