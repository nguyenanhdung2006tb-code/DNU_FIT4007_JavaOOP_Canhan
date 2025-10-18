package part8.oop.constructor;

public class Example08ProductManagement {
    public static void main(String[] args) {
        // Tạo đối tượng bằng constructor mặc định
        Product p1 = new Product();
        p1.setName("Laptop Dell");
        p1.setPrice(18500000);
        p1.setQuantity(10);

        // Tạo đối tượng bằng constructor có tham số
        Product p2 = new Product("Chuột Logitech", 350000, 25);

        // In thông tin sản phẩm
        System.out.println(p1);
        System.out.println(p2);
    }
}
