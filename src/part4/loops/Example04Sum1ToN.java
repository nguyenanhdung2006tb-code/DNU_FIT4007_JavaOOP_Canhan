package part4.loops;

import java.util.Scanner;

public class Example04Sum1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên dương N: ");
        int N = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println("Tổng các số từ 1 đến " + N + " là: " + sum);
    }
}
