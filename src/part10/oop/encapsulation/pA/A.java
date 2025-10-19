package part10.oop.encapsulation.pA;

public class A {
    // Thuộc tính a là private => chỉ class A mới truy cập được
    private int a;

    // Constructor
    public A(int a) {
        this.a = a;
    }

    // Phương thức getter (cho phép đọc giá trị a một cách an toàn)
    public int getA() {
        return a;
    }

    // Phương thức setter (cho phép gán giá trị a một cách có kiểm soát)
    public void setA(int a) {
        this.a = a;
    }
}
