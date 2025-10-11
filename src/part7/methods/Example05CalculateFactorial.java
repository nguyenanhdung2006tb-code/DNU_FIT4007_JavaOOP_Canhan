package part7.methods;

import java.util.Scanner;

public class Example05CalculateFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        // Vòng lặp đảm bảo người dùng nhập số nguyên dương
        do {
            System.out.print("Nhập vào số nguyên dương N để tính giai thừa (N!): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên hợp lệ.");
                scanner.next(); // Bỏ qua input không hợp lệ
            }
            N = scanner.nextInt();
        } while (N < 0);

        // Gọi phương thức tính giai thừa
        long result = calculateFactorial(N);

        System.out.println("Giai thừa của " + N + "! là: " + result);

        scanner.close();
    }


    public static long calculateFactorial(int N) {
        // Trường hợp đặc biệt: 0! = 1
        if (N == 0) {
            return 1;
        }

        // Sử dụng long để lưu trữ kết quả, vì giai thừa tăng rất nhanh
        long factorial = 1;

        // Vòng lặp từ 1 đến N: factorial = 1 * 2 * 3 * ... * N
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }

        return factorial;
    }
}