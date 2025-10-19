package part10.oop.encapsulation.pA;

public class B {
    public void testB() {
        A obj = new A(3);
        obj.inc(); // gọi được vì cùng package
        System.out.println("B thấy a sau khi tăng: " + obj.getA());
    }
}
