package part10.oop.encapsulation.pA;

public class A {
    private int a; // không cho truy cập trực tiếp bên ngoài

    public A(int a) {
        this.a = a;
    }

    // chỉ dùng được trong cùng package
    void inc() {
        a++;
    }

    // chỉ dùng được trong cùng package và subclass
    protected int sqr() {
        return a * a;
    }

    // hàm để xem giá trị hiện tại
    public void showA() {
        System.out.println("Giá trị a = " + a);
    }
}
