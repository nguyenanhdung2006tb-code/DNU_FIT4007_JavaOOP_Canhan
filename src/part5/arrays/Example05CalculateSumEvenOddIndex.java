package part5.arrays;

import java.util.Scanner;

public class Example05CalculateSumEvenOddIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên dương N (kích thước mảng): ");
        int n = sc.nextInt();

        // Kiểm tra N phải là số dương
        if (n <= 0) {
            System.out.println("N phải là số nguyên dương. Kết thúc chương trình.");
            sc.close();
            return;
        }

        // Khởi tạo mảng có kích thước N
        int[] a = new int[n];

        // Khởi tạo biến lưu tổng, dùng long để tránh tràn số
        long sum = 0;

        // Nhập lần lượt N phần tử của mảng a
        System.out.println("Nhập " + n + " phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }


        for (int i = 0; i < n; i++) {
            // Điều kiện 1: Kiểm tra chỉ số i có phải là số lẻ không (i % 2 != 0)
            // Điều kiện 2: Kiểm tra phần tử a[i] có phải là số chẵn không (a[i] % 2 == 0)

            if ((i % 2 != 0) && (a[i] % 2 == 0)) {
                sum += a[i];
            }
        }

        // 4. In ra kết quả
        System.out.println("Tổng các phần tử chẵn ở chỉ số lẻ là: " + sum);

        sc.close();
    }
}