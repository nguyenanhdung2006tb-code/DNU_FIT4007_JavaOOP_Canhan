package part10.oop.encapsulation.pB;

import part10.oop.encapsulation.pA.A;

public class C extends A {
    public C(int a) {
        super(a);
    }

    public void testC() {
        // có thể gọi sqr() vì C là subclass của A
        System.out.println("Bình phương của a trong C: " + sqr());
    }
}
