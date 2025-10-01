package part5.arrays;

import java.util.Scanner;

public class Example04CalculateSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Nhập vào số nguyên dương N (kích thước mảng)
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

        // Khởi tạo biến lưu tổng, phải là 0
        long sum = 0;

        // 2. Nhập lần lượt N phần tử của mảng a và tính tổng đồng thời
        System.out.println("Nhập " + n + " phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            // 3. Tính tổng (cộng phần tử vừa nhập vào biến sum)
            sum += a[i]; // Tương đương với: sum = sum + a[i];
        }

        // 4. In ra tổng của mảng
        System.out.println("Tổng của mảng là: " + sum);

        sc.close();
    }
}