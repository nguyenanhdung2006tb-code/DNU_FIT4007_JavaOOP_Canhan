package part10.oop.encapsulation.pA;

public class B {
    public void showA() {
        A objA = new A(10);
        // Không thể truy cập trực tiếp objA.a vì a là private
        System.out.println("Giá trị của a thông qua getter: " + objA.getA());
    }
}
