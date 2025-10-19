package part9.oop.methods;

public class Example05SquareMethod {
    public static void main(String[] args) {
        Square s1 = new Square(5);
        Square s2 = new Square(7.3);
        Square s3 = new Square(10.0);

        System.out.println("=== Hình vuông 1 ===");
        System.out.println(s1);
        System.out.println("Chu vi: " + s1.getPerimeter());
        System.out.println("Diện tích: " + s1.getArea());
        System.out.println("Cạnh là số nguyên: " + s1.isIntegerSquareSide());

        System.out.println("\n=== Hình vuông 2 ===");
        System.out.println(s2);
        System.out.println("Chu vi: " + s2.getPerimeter());
        System.out.println("Diện tích: " + s2.getArea());
        System.out.println("Cạnh là số nguyên: " + s2.isIntegerSquareSide());

        System.out.println("\n=== Hình vuông 3 ===");
        System.out.println(s3);
        System.out.println("Chu vi: " + s3.getPerimeter());
        System.out.println("Diện tích: " + s3.getArea());
        System.out.println("Cạnh là số nguyên: " + s3.isIntegerSquareSide());
    }
}
