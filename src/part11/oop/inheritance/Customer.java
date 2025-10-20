package part11.oop.inheritance;

import java.util.Scanner;

public class Customer extends User {
    private String shippingAddress;

    public Customer() { super(); }

    public Customer(String userId, String username, String password, String email, String shippingAddress) {
        super(userId, username, password, email);
        this.shippingAddress = shippingAddress;
    }

    public String getShippingAddress() { return shippingAddress; }
    public void setShippingAddress(String shippingAddress) { this.shippingAddress = shippingAddress; }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter shipping address: ");
        shippingAddress = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Customer: " + super.toString() + ", shippingAddress=" + shippingAddress;
    }
}
