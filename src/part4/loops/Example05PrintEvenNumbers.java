package part4.loops;

import java.util.Scanner;

public class Example05PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương N
        System.out.print("Nhập vào một số nguyên dương N: ");
        int N = scanner.nextInt();

        // In ra các số chẵn <= N
        System.out.println("Các số chẵn nhỏ hơn hoặc bằng " + N + " là:");
        for (int i = 2; i <= N; i += 2) {
            System.out.println(i);
        }

        scanner.close();
    }
}
