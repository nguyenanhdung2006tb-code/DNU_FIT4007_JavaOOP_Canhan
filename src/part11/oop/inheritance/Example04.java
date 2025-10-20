package part11.oop.inheritance;

public class Example04 {
    public static void main(String[] args) {
        Square sq = new Square(10);

        System.out.println(sq);
        System.out.println("Perimeter: " + sq.getPerimeter());
        System.out.println("Area: " + sq.getArea());

        sq.setSide(20);
        System.out.println(sq);
        System.out.println("Perimeter: " + sq.getPerimeter());
        System.out.println("Area: " + sq.getArea());

        sq.input(); // nhập thông tin mới
        System.out.println("Perimeter: " + sq.getPerimeter());
        System.out.println("Area: " + sq.getArea());
    }
}
