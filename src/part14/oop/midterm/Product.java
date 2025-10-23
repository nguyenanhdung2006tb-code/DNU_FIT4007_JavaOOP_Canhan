package part14.oop.midterm;

import java.util.Scanner;

public abstract class Product {
    protected int id;
    protected String name;
    protected TypeProduct type;
    protected long price;

    public Product() {}

    public Product(int id, String name, TypeProduct type, long price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public TypeProduct getType() { return type; }
    public void setType(TypeProduct type) { this.type = type; }
    public long getPrice() { return price; }
    public void setPrice(long price) { this.price = price; }

    public void input(TypeProduct type) {
        Scanner sc = new Scanner(System.in);
        this.type = type;
        System.out.print("Nhập mã sản phẩm: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        name = sc.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        price = Long.parseLong(sc.nextLine());
    }

    public abstract long priceForSale();

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Type: " + type.getName() + ", Price: " + price;
    }
}
