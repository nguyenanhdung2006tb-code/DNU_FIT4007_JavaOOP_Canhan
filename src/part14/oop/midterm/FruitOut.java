package part14.oop.midterm;

import java.util.Scanner;

public class FruitOut extends Fruit {
    private String origin;
    private double extraOut;

    public FruitOut() {}

    public FruitOut(int id, String name, double price, String origin, double extraOut) {
        super(id, name, price);
        this.origin = origin;
        this.extraOut = extraOut;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getExtraOut() {
        return extraOut;
    }

    public void setExtraOut(double extraOut) {
        this.extraOut = extraOut;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập xuất xứ: ");
        origin = sc.nextLine();
        System.out.print("Nhập phí nhập khẩu: ");
        extraOut = Double.parseDouble(sc.nextLine());
    }

    @Override
    public double priceForSale() {
        return price + extraOut + 0.1 * extraOut;
    }

    @Override
    public String toString() {
        return super.toString() + ", Origin: " + origin + ", ExtraOut: " + extraOut + ", PriceForSale: " + priceForSale();
    }
}
