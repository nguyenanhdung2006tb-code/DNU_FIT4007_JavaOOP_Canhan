package part13.oop.abstraction;

import java.util.Scanner;

public class Rectangle extends Shape {
    private float width;
    private float height;

    public Rectangle() {
    }

    public Rectangle(String color, float width, float height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập màu: ");
        setColor(sc.nextLine());
        System.out.print("Nhập chiều rộng: ");
        width = sc.nextFloat();
        System.out.print("Nhập chiều dài: ");
        height = sc.nextFloat();
    }

    @Override
    public float getArea() {
        return width * height;
    }

    @Override
    public float getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Hình chữ nhật [màu = " + getColor()
                + ", chiều rộng = " + width
                + ", chiều dài = " + height
                + ", chu vi = " + getPerimeter()
                + ", diện tích = " + getArea() + "]";
    }
}
