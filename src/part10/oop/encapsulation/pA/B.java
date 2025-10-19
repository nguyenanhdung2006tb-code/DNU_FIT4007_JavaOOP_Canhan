package part10.oop.encapsulation.pA;

public class B {
    public void testA() {
        A objA = new A(5);
        objA.showA();

        // có thể gọi inc() vì B nằm cùng package với A
        objA.inc();
        System.out.println("Sau khi gọi inc() trong B:");
        objA.showA();

        // có thể gọi sqr() vì B cùng package
        System.out.println("Bình phương của a trong B: " + objA.sqr());
    }
}
