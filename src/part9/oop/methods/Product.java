package part9.oop.methods;

public class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor mặc định
    public Product() {
    }

    // Constructor có tham số
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Tính tổng giá trị của sản phẩm
    public double getTotalPrice() {
        return price * quantity;
    }

    // Tăng số lượng lên 1
    public void increaseQuantity() {
        quantity++;
    }

    // Giảm số lượng xuống 1 (nhưng không âm)
    public void decreaseQuantity() {
        if (quantity > 0) {
            quantity--;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
