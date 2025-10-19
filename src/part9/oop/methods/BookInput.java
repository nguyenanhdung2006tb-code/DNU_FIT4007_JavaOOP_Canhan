package part9.oop.methods;

import java.util.Scanner;

public class BookInput {
    private String name;
    private double price;
    private int quantity;

    // Constructor mặc định
    public BookInput() {
    }

    // Constructor có tham số
    public BookInput(String name, double price, int quantity) {
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

    // Phương thức input từ bàn phím
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sách: ");
        name = sc.nextLine();

        System.out.print("Nhập giá sách: ");
        price = sc.nextDouble();

        System.out.print("Nhập số lượng sách: ");
        quantity = sc.nextInt();
    }

    @Override
    public String toString() {
        return "BookInput{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
