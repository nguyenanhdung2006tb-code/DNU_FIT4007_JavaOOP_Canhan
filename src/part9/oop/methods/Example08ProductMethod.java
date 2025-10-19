package part9.oop.methods;

public class Example08ProductMethod {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1500.0, 3);
        Product p2 = new Product("Smartphone", 800.0, 5);

        System.out.println("=== Thông tin sản phẩm ban đầu ===");
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("\n=== Tổng giá trị mỗi sản phẩm ===");
        System.out.println(p1.getName() + " - Tổng giá trị: " + p1.getTotalPrice());
        System.out.println(p2.getName() + " - Tổng giá trị: " + p2.getTotalPrice());

        System.out.println("\n=== Tăng/giảm số lượng ===");
        p1.increaseQuantity();
        p2.decreaseQuantity();

        System.out.println(p1.getName() + " sau khi tăng số lượng: " + p1.getQuantity());
        System.out.println(p2.getName() + " sau khi giảm số lượng: " + p2.getQuantity());
    }
}
