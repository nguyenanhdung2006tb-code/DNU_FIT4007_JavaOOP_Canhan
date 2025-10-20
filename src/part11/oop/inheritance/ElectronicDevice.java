package part11.oop.inheritance;

import java.util.Scanner;

public class ElectronicDevice {
    private String manufacturer;
    private long price;

    public ElectronicDevice() {}

    public ElectronicDevice(String manufacturer, long price) {
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ElectronicDevice{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter manufacturer: ");
        manufacturer = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextLong();
    }
}
