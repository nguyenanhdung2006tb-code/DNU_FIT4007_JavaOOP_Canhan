package part10.oop.encapsulation;

import part10.oop.encapsulation.pA.B;
import part10.oop.encapsulation.pB.C;

public class TestEncapsulation {
    public static void main(String[] args) {
        System.out.println("=== Test Ví dụ 4 ===");

        B b = new B();
        b.testB();

        C c = new C(10);
        c.testC();

        c.setA(50);
        System.out.println("Giá trị a sau khi setA từ main: " + c.getA());
    }
}
