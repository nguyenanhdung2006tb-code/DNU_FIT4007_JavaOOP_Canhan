package part11.oop.inheritance;

import java.util.Scanner;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(float side) {
        super(side, side);
    }

    public float getSide() {
        return getWidth(); // width = height for square
    }

    public void setSide(float side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        float side = sc.nextFloat();
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square [side=" + getSide() + "]";
    }
}
