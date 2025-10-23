package part14.oop.midterm;

import java.util.Scanner;

public class ProductIn extends Product {
    private long extraIn;

    public ProductIn() {}

    public ProductIn(int id, String name, TypeProduct type, long price, long extraIn) {
        super(id, name, type, price);
        this.extraIn = extraIn;
    }

    public long getExtraIn() { return extraIn; }
    public void setExtraIn(long extraIn) { this.extraIn = extraIn; }

    @Override
    public void input(TypeProduct type) {
        super.input(type);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập phí nội bộ: ");
        extraIn = Long.parseLong(sc.nextLine());
    }

    @Override
    public long priceForSale() {
        return price + extraIn;
    }

    @Override
    public String toString() {
        return super.toString() + ", ExtraIn: " + extraIn + ", PriceForSale: " + priceForSale();
    }
}
