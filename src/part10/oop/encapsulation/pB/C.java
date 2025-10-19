package part10.oop.encapsulation.pB;

import part10.oop.encapsulation.pA.A;

public class C extends A {
    public C(int a) {
        super(a);
    }

    public void displayA() {
        // Không thể truy cập trực tiếp biến a, phải dùng getter
        System.out.println("Giá trị a từ class C (kế thừa A): " + getA());
    }
}
