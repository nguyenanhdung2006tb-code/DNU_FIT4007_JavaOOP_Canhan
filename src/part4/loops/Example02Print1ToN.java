package part4.loops;

import java.util.Scanner;

public class Example02Print1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N;

        do {
            System.out.print("Enter a positive integer N: ");
            while (!sc.hasNextLong()) {
                System.out.print("Please enter a valid positive integer: ");
                sc.next();
            }
            N = sc.nextLong();
        } while (N <= 0);

        for (long i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }
}
