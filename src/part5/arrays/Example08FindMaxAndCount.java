package part5.arrays;

import java.util.Scanner;

public class Example08FindMaxAndCount {
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

        // --- BƯỚC 1: TÌM GIÁ TRỊ LỚN NHẤT (MAX) ---

        int max = a[0]; // Giả định phần tử đầu tiên là Max ban đầu

        // Duyệt mảng từ phần tử thứ hai (i = 1) để tìm Max
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i]; // Cập nhật Max
            }
        }

        // --- BƯỚC 2: ĐẾM SỐ LƯỢNG PHẦN TỬ CÓ GIÁ TRỊ BẰNG MAX ---

        int count = 0; // Biến đếm số lần xuất hiện của Max

        // Duyệt toàn bộ mảng (từ i = 0)
        for (int i = 0; i < n; i++) {
            if (a[i] == max) {
                count++; // Tăng biến đếm nếu phần tử bằng giá trị Max đã tìm được
            }
        }

        // 3. In ra kết quả
        System.out.println("Giá trị lớn nhất (Max) trong mảng là: " + max);
        System.out.println("Số lượng phần tử mang giá trị " + max + " là: " + count);

        sc.close();
    }
}