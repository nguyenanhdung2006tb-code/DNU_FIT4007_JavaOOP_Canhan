package part10.oop.encapsulation;

import part10.oop.encapsulation.pA.B;
import part10.oop.encapsulation.pB.C;

public class TestEncapsulation {
    public static void main(String[] args) {
        System.out.println("=== Kiểm tra từ class B (cùng package với A) ===");
        B objB = new B();
        objB.testA();

        System.out.println("\n=== Kiểm tra từ class C (subclass của A, khác package) ===");
        C objC = new C(7);
        objC.testC();
    }
}
