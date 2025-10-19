package part10.oop.encapsulation.pA;

public class B {
    public void testInc() {
        A obj = new A(5);
        obj.inc(); // hợp lệ vì B cùng package với A
        System.out.println("Giá trị a sau khi tăng: " + obj.getA());
    }
}
