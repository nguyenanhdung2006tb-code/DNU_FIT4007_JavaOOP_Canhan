package part10.oop.encapsulation;

import part10.oop.encapsulation.pA.B;
import part10.oop.encapsulation.pB.C;

public class TestEncapsulation {
    public static void main(String[] args) {
        System.out.println("=== Kiểm tra tính đóng gói ===");
        B b = new B();
        b.showA();

        C c = new C(20);
        c.displayA();
    }
}
