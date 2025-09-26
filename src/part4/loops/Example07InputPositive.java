package part4.loops;

import java.util.Scanner;

public class Example07InputPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        do {
            System.out.print("Nhập vào số nguyên N (>0): ");
            N = sc.nextInt();
        } while (N <= 0);

        System.out.println("Bạn đã nhập N = " + N);
    }
}
