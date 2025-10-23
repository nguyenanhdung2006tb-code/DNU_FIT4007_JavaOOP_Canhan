package part14.oop.midterm;

import java.util.Scanner;

public class FruitIn extends Fruit {
    private double extraIn;

    public FruitIn() {}

    public FruitIn(int id, String name, double price, double extraIn) {
        super(id, name, price);
        this.extraIn = extraIn;
    }

    public double getExtraIn() {
        return extraIn;
    }

    public void setExtraIn(double extraIn) {
        this.extraIn = extraIn;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập phí nội bộ: ");
        extraIn = Double.parseDouble(sc.nextLine());
    }

    @Override
    public double priceForSale() {
        return price + extraIn;
    }

    @Override
    public String toString() {
        return super.toString() + ", ExtraIn: " + extraIn + ", PriceForSale: " + priceForSale();
    }
}
