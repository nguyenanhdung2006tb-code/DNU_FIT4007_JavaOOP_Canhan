package part5.arrays;

import java.util.Scanner;

public class Example06PrintFirstLastElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Nhập vào số nguyên dương N (kích thước mảng)
        System.out.print("Nhập vào số nguyên dương N (kích thước mảng): ");
        int n = sc.nextInt();

        // Kiểm tra N phải là số dương và có ít nhất 1 phần tử
        if (n <= 0) {
            System.out.println("Mảng phải có ít nhất một phần tử. Kết thúc chương trình.");
            sc.close();
            return;
        }

        // Khởi tạo mảng có kích thước N
        int[] a = new int[n];

        // 2. Nhập N phần tử của mảng a
        System.out.println("Nhập " + n + " phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // 3. In ra phần tử đầu tiên và phần tử cuối cùng

        // Phần tử đầu tiên luôn có chỉ số là 0
        int firstElement = a[0];

        // Phần tử cuối cùng luôn có chỉ số là N - 1
        int lastElement = a[n - 1];

        System.out.println("Phần tử đầu tiên của mảng là: " + firstElement);
        System.out.println("Phần tử cuối cùng của mảng là: " + lastElement);

        sc.close();
    }
}