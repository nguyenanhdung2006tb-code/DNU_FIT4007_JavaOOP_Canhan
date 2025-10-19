package part10.oop.encapsulation.pA;

public class A {
    private int a; // chỉ class A mới truy cập trực tiếp

    public A(int a) {
        this.a = a;
    }

    // chỉ dùng trong cùng package
    void inc() {
        a++;
    }

    // cho subclass hoặc cùng package
    protected int sqr() {
        return a * a;
    }

    // dùng được trong toàn bộ project
    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
}
