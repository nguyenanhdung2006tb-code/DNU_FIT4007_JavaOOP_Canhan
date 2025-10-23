package part14.oop.midterm;

import java.util.Scanner;

public class Fruit implements IFruit {
    protected int id;
    protected String name;
    protected double price;

    public Fruit() {}

    public Fruit(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã trái cây: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên trái cây: ");
        name = sc.nextLine();
        System.out.print("Nhập giá trái cây: ");
        price = Double.parseDouble(sc.nextLine());
    }

    @Override
    public double priceForSale() {
        return price;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Price: " + price;
    }
}
