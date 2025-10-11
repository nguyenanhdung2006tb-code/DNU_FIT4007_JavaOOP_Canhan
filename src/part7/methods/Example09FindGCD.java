package part7.methods;

import java.util.Scanner;

public class Example09FindGCD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        // Đảm bảo nhập số nguyên dương thứ nhất và không nhập chữ
        do {
            System.out.print("Nhập số nguyên dương thứ nhất (a): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ.");
                scanner.next();
            }
            a = scanner.nextInt();
        } while (a <= 0);

        // Đảm bảo nhập số nguyên dương thứ hai và không nhập chữ
        do {
            System.out.print("Nhập số nguyên dương thứ hai (b): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ.");
                scanner.next();
            }
            b = scanner.nextInt();
        } while (b <= 0);

        // Gọi phương thức tìm ƯCLN
        int gcd = findGCD(a, b);

        System.out.println("\nHai số đã nhập: a = " + a + ", b = " + b);
        System.out.println("Ước chung lớn nhất (ƯCLN) là: " + gcd);

        scanner.close();
    }


    public static int findGCD(int num1, int num2) {
        // Thuật toán Euclid:
        // Lặp cho đến khi cả hai số bằng nhau. Khi đó, số kia hoặc số còn lại chính là ƯCLN.
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2; // Thay thế số lớn hơn bằng hiệu của hai số
            } else {
                num2 = num2 - num1; // tương tự
            }
        }
        // cứ trừ cho đến khi num1 == num2, giá trị đó chính là ƯCLN
        // ta có thể return num1 hoặc num2 tùy thích bởi vì khi 2 số bằng nhau rồi
        // thì số nào cũng là ƯCLN của hai số
        return num1;
    }
}