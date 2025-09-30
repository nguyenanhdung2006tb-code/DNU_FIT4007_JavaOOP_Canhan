package part5.arrays;

import java.util.Scanner;

public class Example09CountEvenNumbers {
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

        // Khởi tạo biến đếm số lượng số chẵn
        int countEven = 0;

        // 2. Nhập N phần tử của mảng a và đếm đồng thời
        System.out.println("Nhập " + n + " phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            // 3. Kiểm tra và đếm: Nếu phần tử vừa nhập là số chẵn
            if (a[i] % 2 == 0) {
                countEven++;
            }
        }

        // 4. In ra kết quả
        System.out.println("Số lượng số chẵn trong mảng là: " + countEven);

        sc.close();
    }
}