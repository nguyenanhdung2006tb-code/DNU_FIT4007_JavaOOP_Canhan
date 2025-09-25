package part4.loops;

import java.util.Scanner;

public class Example09Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();

        long factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }

        System.out.println(N + "! = " + factorial);
    }
}
