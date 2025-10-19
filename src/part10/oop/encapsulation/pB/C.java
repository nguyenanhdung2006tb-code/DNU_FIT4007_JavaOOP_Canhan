package part10.oop.encapsulation.pB;

import part10.oop.encapsulation.pA.A;

public class C extends A {
    public C(int a) {
        super(a);
    }

    public void tryInc() {
        // inc() không thể gọi được vì khác package và không được protected
        System.out.println("Giá trị a hiện tại (trong class C): " + getA());
    }
}
