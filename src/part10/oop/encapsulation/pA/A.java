package part10.oop.encapsulation.pA;

public class A {
    private int a; // không cho phép truy cập trực tiếp bên ngoài

    // Hàm khởi tạo
    public A(int a) {
        this.a = a;
    }

    // Hàm protected chỉ dùng trong cùng package
    void inc() {
        a++;
    }

    // Getter để đọc giá trị a
    public int getA() {
        return a;
    }
}
