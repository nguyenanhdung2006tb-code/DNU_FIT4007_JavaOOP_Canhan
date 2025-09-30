package part5.arrays;

import java.util.Scanner;
public class Example07FindMinMaxElement {
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

        // 3. Khởi tạo giá trị Min và Max ban đầu
        // gán chúng bằng phần tử đầu tiên của mảng (a[0])
        int max = a[0];
        int min = a[0];

        // 4. Duyệt mảng từ phần tử thứ hai (chỉ số i = 1) trở đi để so sánh
        for (int i = 1; i < n; i++) {
            // So sánh để tìm Max
            if (a[i] > max) {
                max = a[i]; // Cập nhật Max nếu tìm thấy giá trị lớn hơn
            }

            // So sánh để tìm Min
            if (a[i] < min) {
                min = a[i]; // Cập nhật Min nếu tìm thấy giá trị nhỏ hơn
            }
        }

        // 5. In ra kết quả
        System.out.println("Giá trị lớn nhất (Max) trong mảng là: " + max);
        System.out.println("Giá trị nhỏ nhất (Min) trong mảng là: " + min);

        sc.close();
    }
}