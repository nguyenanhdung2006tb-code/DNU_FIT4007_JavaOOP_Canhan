package part6.strings;

import java.util.Scanner;

public class Example08PrintStarTower {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        // Vòng lặp để đảm bảo người dùng nhập số nguyên dương
        do {
            System.out.print("Nhập vào số nguyên dương N (ví dụ: 5): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên hợp lệ.");
                scanner.next(); // Bỏ qua input không hợp lệ
            }
            N = scanner.nextInt();
        } while (N <= 0);

        System.out.println("In ra tháp sao với N = " + N + ":");
        printStarTower(N);

        scanner.close();
    }


    public static void printStarTower(int N) {
        // Vòng lặp duy nhất chạy từ 1 đến N
        for (int i = 1; i <= N; i++) {

            // Sử dụng phương thức repeat() để in '*' i lần
            String stars = "*".repeat(i);

            System.out.println(stars);
        }
    }

}