package part7.methods;

import java.util.Scanner;

public class Example16CalculateSquareSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        // Đảm bảo nhập số nguyên dương
        do {
            System.out.print("Nhập vào số nguyên dương N để tính tổng 1^2 + ... + N^2: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ.");
                scanner.next();
            }
            N = scanner.nextInt();
        } while (N <= 0);

        // Gọi phương thức tính tổng
        long totalSum = calculateSquareSum(N);

        System.out.println("\nGiá trị N đã nhập: " + N);
        System.out.println("Tổng S = 1^2 + 2^2 + ... + " + N + "^2 là: " + totalSum);

        scanner.close();
    }

    public static long calculateSquareSum(int N) {
        // Sử dụng long cho tổng để đề phòng N lớn (ví dụ: N=100000)
        long sum = 0;

        // Vòng lặp từ 1 đến N
        for (int i = 1; i <= N; i++) {
            // Tính bình phương của i (i * i) và cộng vào tổng.
            // Ép kiểu (long) để đảm bảo phép nhân được thực hiện với kiểu long, tránh tràn số int.
            sum += (long) i * i;
        }


        return sum;
    }
}