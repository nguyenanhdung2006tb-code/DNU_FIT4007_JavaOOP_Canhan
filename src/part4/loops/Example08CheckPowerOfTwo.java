package part4.loops;

import java.util.Scanner;

public class Example08CheckPowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();

        boolean isPowerOfTwo = (N > 0) && ((N & (N - 1)) == 0);
        if (isPowerOfTwo) {
            System.out.println(N + " là lũy thừa của 2");
        } else {
            System.out.println(N + " không phải là lũy thừa của 2");
        }
    }
}
