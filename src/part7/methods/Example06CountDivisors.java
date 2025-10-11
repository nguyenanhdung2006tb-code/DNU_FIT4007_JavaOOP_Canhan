package part7.methods;

import java.util.Scanner;

public class Example06CountDivisors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        // Vòng lặp đảm bảo người dùng nhập số nguyên dương và không được nhập chữ cái
        do {
            System.out.print("Nhập vào số nguyên dương N để tính số lượng ước: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên hợp lệ.");
                scanner.next();
            }
            N = scanner.nextInt();
        } while (N <= 0);

        // Gọi phương thức tính số ước
        int divisorCount = countDivisors(N);

        System.out.println("Số lượng ước của " + N + " là: " + divisorCount);

        scanner.close();
    }


    public static int countDivisors(int N) {
        int count = 0;

        for (int i = 1; i <= N; i++) {
            // Kiểm tra điều kiện: i là ước của N nếu N chia hết cho i
            if (N % i == 0) {
                count++; // Tăng số lượng ước
            }
        }

        return count;
    }
}