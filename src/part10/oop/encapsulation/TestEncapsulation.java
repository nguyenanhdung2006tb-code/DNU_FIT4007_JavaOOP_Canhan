package part10.oop.encapsulation;

import part10.oop.encapsulation.pA.B;
import part10.oop.encapsulation.pB.C;

public class TestEncapsulation {
    public static void main(String[] args) {
        B objB = new B();
        objB.testInc();

        C objC = new C(10);
        objC.tryInc();
    }
}
