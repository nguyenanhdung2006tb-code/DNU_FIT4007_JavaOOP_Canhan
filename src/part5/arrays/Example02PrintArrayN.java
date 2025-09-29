package part5.arrays;

import java.util.Scanner;

public class Example02PrintArrayN {
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

        // 2. Nhập lần lượt N phần tử của mảng a
        System.out.println("Nhập " + n + " phần tử của mảng (cách nhau bằng dấu cách hoặc Enter):");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // 3. In ra các phần tử của mảng a trên một dòng, giữa 2 phần tử có một dấu cách
        System.out.print("Các phần tử của mảng a là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);

            // Chỉ in dấu cách nếu đây không phải là phần tử cuối cùng
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(); // Xuống dòng sau khi in xong mảng

        sc.close();
    }
}