package part4.loops;

import java.util.Scanner;

public class Example15SumFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i * (i + 1);
        }

    }
}
