package part14.oop.midterm;

import java.util.Scanner;

public class ProductOut extends Product {
    private long extraOut;

    public ProductOut() {}

    public ProductOut(int id, String name, TypeProduct type, long price, long extraOut) {
        super(id, name, type, price);
        this.extraOut = extraOut;
    }

    public long getExtraOut() { return extraOut; }
    public void setExtraOut(long extraOut) { this.extraOut = extraOut; }

    @Override
    public void input(TypeProduct type) {
        super.input(type);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập phí nhập khẩu: ");
        extraOut = Long.parseLong(sc.nextLine());
    }

    @Override
    public long priceForSale() {
        return price + extraOut + (long)(0.1 * extraOut);
    }

    @Override
    public String toString() {
        return super.toString() + ", ExtraOut: " + extraOut + ", PriceForSale: " + priceForSale();
    }
}
