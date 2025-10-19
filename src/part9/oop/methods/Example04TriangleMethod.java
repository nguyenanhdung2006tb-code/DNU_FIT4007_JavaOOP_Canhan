package part9.oop.methods;

public class Example04TriangleMethod {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(3, 4, 5);
        Triangle t2 = new Triangle(5, 5, 5);
        Triangle t3 = new Triangle(5, 5, 8);

        System.out.println("=== Tam giác 1 ===");
        System.out.println(t1);
        System.out.println("Chu vi: " + t1.getPerimeter());
        System.out.println("Diện tích: " + t1.getArea());
        System.out.println("Vuông: " + t1.isRightTriangle());
        System.out.println("Cân: " + t1.isIsoscelesTriangle());
        System.out.println("Đều: " + t1.isEquilateralTriangle());

        System.out.println("\n=== Tam giác 2 ===");
        System.out.println(t2);
        System.out.println("Chu vi: " + t2.getPerimeter());
        System.out.println("Diện tích: " + t2.getArea());
        System.out.println("Vuông: " + t2.isRightTriangle());
        System.out.println("Cân: " + t2.isIsoscelesTriangle());
        System.out.println("Đều: " + t2.isEquilateralTriangle());

        System.out.println("\n=== Tam giác 3 ===");
        System.out.println(t3);
        System.out.println("Chu vi: " + t3.getPerimeter());
        System.out.println("Diện tích: " + t3.getArea());
        System.out.println("Vuông: " + t3.isRightTriangle());
        System.out.println("Cân: " + t3.isIsoscelesTriangle());
        System.out.println("Đều: " + t3.isEquilateralTriangle());
    }
}
