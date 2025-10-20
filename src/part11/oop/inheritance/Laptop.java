package part11.oop.inheritance;

import java.util.Scanner;

public class Laptop extends ElectronicDevice {
    private String screenSize;

    public Laptop() {}

    public Laptop(String manufacturer, long price, String screenSize) {
        super(manufacturer, price);
        this.screenSize = screenSize;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter screen size: ");
        screenSize = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "manufacturer='" + getManufacturer() + '\'' +
                ", price=" + getPrice() +
                ", screenSize='" + screenSize + '\'' +
                '}';
    }
}
