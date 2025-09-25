package part4.loops;

import java.util.Scanner;

public class Example06FindSmallestN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương S: ");
        int S = sc.nextInt();

        int sum = 0;
        int N = 0;

        while (sum + (N + 1) <= S) {
            N++;
            sum += N;
        }

        System.out.println("Số nguyên dương N nhỏ nhất thoả mãn: " + N);
        System.out.println("Tổng 1 + 2 + ... + N = " + sum);
    }
}
