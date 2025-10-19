package part10.oop.encapsulation.pB;

import part10.oop.encapsulation.pA.A;

public class C extends A {
    public C(int a) {
        super(a);
    }

    public void testC() {
        System.out.println("C thấy a bình phương qua sqr(): " + sqr());
        setA(20);
        System.out.println("C thay đổi a bằng setA, giá trị mới: " + getA());
    }
}
