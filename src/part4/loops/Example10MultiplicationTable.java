package part4.loops;

import java.util.Scanner;

public class Example10MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        do {
            System.out.print("Nhập N (1 <= N <= 9): ");
            N = sc.nextInt();
        } while (N < 1 || N > 9);

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
    }
}
