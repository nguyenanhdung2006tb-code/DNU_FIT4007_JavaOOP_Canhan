package part5.arrays;

import java.util.Scanner;

public class Example13CheckNonDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Nhập N và Mảng A
        System.out.print("Nhập vào số nguyên dương N (kích thước mảng): ");
        int n = sc.nextInt();

        // Kiểm tra N
        // Với N <= 1, mảng luôn được coi là không giảm (trivi al case)
        if (n <= 0) {
            System.out.println("Mảng rỗng không được kiểm tra. Kết thúc chương trình.");
            sc.close();
            return;
        }

        int[] a = new int[n];
        System.out.println("Nhập " + n + " phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // --- 2. Thuật toán kiểm tra không giảm ---

        // Cờ (flag) để theo dõi kết quả. Giả định ban đầu là mảng KHÔNG GIẢM (true)
        boolean isNonDecreasing = true;

        // Duyệt mảng, bắt đầu từ phần tử thứ hai (chỉ số i = 1)
        for (int i = 1; i < n; i++) {
            // Điều kiện kiểm tra: Nếu phần tử HIỆN TẠI (a[i]) nhỏ hơn phần tử TRƯỚC ĐÓ (a[i-1])
            // Tức là: Tồn tại sự giảm (Decreasing)
            if (a[i] < a[i - 1]) {
                isNonDecreasing = false; // Đặt cờ thành false
                break;                   // Thoát khỏi vòng lặp ngay lập tức vì đã tìm thấy sự giảm
            }
        }

        // 3. In ra kết quả
        System.out.print("Mảng đã nhập ");
        if (isNonDecreasing) {
            System.out.println("Là mảng không giảm.");
        } else {
            System.out.println("Không phải là mảng không giảm.");
        }

        sc.close();
    }
}