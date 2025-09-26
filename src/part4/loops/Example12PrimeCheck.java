package part4.loops;

import java.util.Scanner;

public class Example12PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên N: ");
        int N = sc.nextInt();

        boolean isPrime = true;
        if (N <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= N; i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(N + " là số nguyên tố");
        } else {
            System.out.println(N + " không phải là số nguyên tố");
        }
    }
}
