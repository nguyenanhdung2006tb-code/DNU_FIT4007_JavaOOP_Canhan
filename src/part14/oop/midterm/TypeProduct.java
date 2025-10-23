package part14.oop.midterm;

import java.util.Scanner;

public class TypeProduct {
    private int id;
    private String name;
    private String description;

    public TypeProduct() {}

    public TypeProduct(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã loại sản phẩm: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên loại sản phẩm: ");
        name = sc.nextLine();
        System.out.print("Nhập mô tả loại sản phẩm: ");
        description = sc.nextLine();
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Description: " + description;
    }
}
