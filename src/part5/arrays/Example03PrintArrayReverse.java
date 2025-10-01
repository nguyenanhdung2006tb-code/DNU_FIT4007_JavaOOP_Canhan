package part5.arrays;

import java.util.Scanner;

public class Example03PrintArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhập vào số nguyên dương N (kích thước mảng): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("N phải là số nguyên dương. Kết thúc chương trình.");
            sc.close();
            return;
        }

        int[] a = new int[n];

        System.out.println("Nhập " + n + " phần tử của mảng (cách nhau bằng dấu cách hoặc Enter):");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Các phần tử của mảng a theo thứ tự ngược lại là: ");

        for (int i = n - 1; i >= 0; i--) {

            System.out.print(a[i]);

            if (i > 0) {
                System.out.print(" ");
            }
        }
        System.out.println();

        sc.close();
    }
}